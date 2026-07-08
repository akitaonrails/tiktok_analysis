package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEcEffectQueryCategory;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveEcEffectHelper$queryStickerEffect$2$1", f = "LiveEcEffectExternalHelper.kt", l = {182, 184}, m = "invokeSuspend")
public final class C403401hY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;
    public final /* synthetic */ C259800zU<LiveEffect> LLILLL;
    public final /* synthetic */ C259800zU<LiveEffect> LLILZ;
    public final /* synthetic */ Function2<LiveEffect, LiveEffect, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C403401hY(StickerEffectViewModel stickerEffectViewModel, C259800zU<LiveEffect> c259800zU, C259800zU<LiveEffect> c259800zU2, Function2<? super LiveEffect, ? super LiveEffect, Unit> function2, String str, String str2, InterfaceC1364105Vn<? super C403401hY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = function2;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C403401hY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEcEffectHelper@723a.queryStickerEffect$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DEK c1dek = this.LLILLJJLI.LLILLJJLI;
            C395501gH c395501gH = new C395501gH(LiveEcEffectQueryCategory.getValue());
            this.LL = 1;
            if (c1dek.LJIJI(c395501gH, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEcEffectHelper@723a.queryStickerEffect$2$1");
                return objLJFF;
            }
        }
        final C013C c013c = new C013C();
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
        final C259800zU<LiveEffect> c259800zU = this.LLILLL;
        final C259800zU<LiveEffect> c259800zU2 = this.LLILZ;
        final Function2<LiveEffect, LiveEffect, Unit> function2 = this.LLILZIL;
        final String str = this.LLILZLL;
        final String str2 = this.LLIZ;
        InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01hX
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                T next;
                AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj2;
                T t = null;
                if (abstractC401801hI instanceof C396001gM) {
                    if (!c013c.element) {
                        C259800zU<LiveEffect> c259800zU3 = c259800zU;
                        C396001gM c396001gM = (C396001gM) abstractC401801hI;
                        List<T> list = c396001gM.LIZIZ;
                        String str3 = str;
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str3)) {
                                    break;
                                }
                            } else {
                                next = (T) null;
                                break;
                            }
                        }
                        c259800zU3.element = (T) next;
                        C259800zU<LiveEffect> c259800zU4 = c259800zU2;
                        List<T> list2 = c396001gM.LIZIZ;
                        String str4 = str2;
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            T next2 = it3.next();
                            if (Intrinsics.LJFF(((LiveEffect) next2).getResourceId(), str4)) {
                                t = next2;
                                break;
                            }
                        }
                        c259800zU4.element = t;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("from net, query sticker effect resule: templateTarget: ");
                        sbLIZ.append(c259800zU.element);
                        sbLIZ.append(", photoTarget: ");
                        sbLIZ.append(c259800zU2.element);
                        C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
                        LiveEffect liveEffect = c259800zU.element;
                        if (liveEffect != null) {
                            liveEffect.LLJLIL(LiveEcEffectQueryCategory.getValue());
                        }
                        LiveEffect liveEffect2 = c259800zU2.element;
                        if (liveEffect2 != null) {
                            liveEffect2.LJIIJJI(LiveEcEffectQueryCategory.getValue());
                        }
                        function2.invoke(c259800zU.element, c259800zU2.element);
                        c013c.element = true;
                    }
                } else if (abstractC401801hI instanceof C396401gQ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("query sticker effect and got error: ");
                    C396401gQ c396401gQ = (C396401gQ) abstractC401801hI;
                    sbLIZ2.append(c396401gQ.LIZIZ);
                    sbLIZ2.append(" noAvailableData=");
                    sbLIZ2.append(c396401gQ.LIZ);
                    C20441214yg.LJ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    if (!c013c.element) {
                        function2.invoke(null, null);
                        Throwable th = new Throwable();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('[');
                        sbLIZ3.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurrentRegionCode());
                        sbLIZ3.append("] query sticker templateResourceId=");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", photoResourceId=");
                        sbLIZ3.append(str2);
                        sbLIZ3.append("and got error: ");
                        sbLIZ3.append(c396401gQ.LIZIZ);
                        sbLIZ3.append(" noAvailableData=");
                        sbLIZ3.append(c396401gQ.LIZ);
                        sbLIZ3.append(' ');
                        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), th);
                    }
                }
                return Unit.LIZ;
            }
        };
        this.LL = 2;
        c2252331DDr.getClass();
        if (C2252331DDr.LJIIJ(c2252331DDr, interfaceC346701Wf, this) == objLJFF) {
            C1C7U.LIZIZ("LiveEcEffectHelper@723a.queryStickerEffect$2$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
