package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.util.imageloading.IMImageMessageMonitor$SnapshotItems$convertToParamsAndReport$1", f = "IMImageMessageMonitor.kt", l = {}, m = "invokeSuspend")
public final class C902460Zam extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C902480Zao LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C902460Zam(C902480Zao c902480Zao, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C902460Zam> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c902480Zao;
        this.LLILLJJLI = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C902460Zam(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iNextIndex;
        C1C7U.LIZ("IMImageMessageMonitor$SnapshotItems@f0f2.convertToParamsAndReport$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C902470Zan> list = this.LL.LIZJ;
        int size = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C902470Zan> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!(it2.next().LIZIZ instanceof C0ICO)) {
                    List<C902470Zan> list2 = this.LL.LIZJ;
                    ListIterator<C902470Zan> listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().LIZIZ instanceof C0ZYR) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                    size = iNextIndex + 1;
                    if (size >= this.LL.LIZJ.size()) {
                        size = this.LL.LIZJ.size() - 1;
                    }
                }
            }
        }
        List<C902470Zan> list3 = this.LL.LIZJ;
        Iterator it3 = C13LP.LL(list3, Math.min(size + 1, list3.size())).iterator();
        long j = 0;
        while (it3.hasNext()) {
            j += ((C902470Zan) it3.next()).LIZ;
        }
        C830490Whz c830490Whz = new C830490Whz();
        C902480Zao c902480Zao = this.LL;
        c830490Whz.put("final_duration", String.valueOf(j));
        c830490Whz.put("attempts", String.valueOf(c902480Zao.LIZJ.size()));
        c830490Whz.put("key", c902480Zao.LIZ);
        c830490Whz.put(Scene.SCENE_SERVICE, c902480Zao.LIZIZ);
        if (c902480Zao.LIZLLL) {
            c830490Whz.put("is_success", "-1");
        } else {
            InterfaceC902450Zal interfaceC902450Zal = ((C902470Zan) ListProtector.get(c902480Zao.LIZJ, size)).LIZIZ;
            if (interfaceC902450Zal instanceof C0ZYR) {
                c830490Whz.put("is_success", CardStruct.IStatusCode.DEFAULT);
                c830490Whz.put("error_msg", ((C0ZYR) interfaceC902450Zal).LIZ);
            } else if (interfaceC902450Zal instanceof C0ICO) {
                c830490Whz.put("is_success", "1");
            } else {
                throw new C1954807lC();
            }
        }
        this.LLILLJJLI.sendEvent("im_image_message_load", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImageMessageMonitor$SnapshotItems@f0f2.convertToParamsAndReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
