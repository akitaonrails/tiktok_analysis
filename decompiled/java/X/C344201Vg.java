package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchMultiAudioFile$1", f = "TTSRequestLogicComponent.kt", l = {265}, m = "invokeSuspend")
public final class C344201Vg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ LinkedHashMap<String, String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;
    public final /* synthetic */ List<Boolean> LLIZ;
    public final /* synthetic */ ITTSCallback LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344201Vg(List<String> list, LinkedHashMap<String, String> linkedHashMap, List<String> list2, CreativeInfo creativeInfo, List<Boolean> list3, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super C344201Vg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = linkedHashMap;
        this.LLILZIL = list2;
        this.LLILZLL = creativeInfo;
        this.LLIZ = list3;
        this.LLIZLLLIL = iTTSCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344201Vg c344201Vg = new C344201Vg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c344201Vg.LLILLJJLI = obj;
        return c344201Vg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        Object obj3;
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            List<String> list = this.LLILLL;
            LinkedHashMap<String, String> linkedHashMap = this.LLILZ;
            List<String> list2 = this.LLILZIL;
            CreativeInfo creativeInfo = this.LLILZLL;
            List<Boolean> list3 = this.LLIZ;
            ITTSCallback iTTSCallback = this.LLIZLLLIL;
            Iterator<String> it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sb = new StringBuilder();
                    if (i2 < list.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        obj2 = "";
                    } else {
                        obj2 = ListProtector.get(list, i2);
                    }
                    sb.append((String) obj2);
                    if (i2 >= list2.size()) {
                        obj3 = "";
                    } else {
                        obj3 = ListProtector.get(list2, i2);
                    }
                    sb.append((String) obj3);
                    linkedHashMap.put(sb.toString(), "");
                    CreativeInfo creativeInfo2 = creativeInfo;
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C344301Vh(list, i2, list2, creativeInfo2, list3, iTTSCallback, null), 3));
                    i2 = i3;
                    creativeInfo = creativeInfo2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
