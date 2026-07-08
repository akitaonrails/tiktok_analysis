package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveEcEffectHelper$queryStickerEffect$1$1", f = "LiveEcEffectExternalHelper.kt", l = {120, 122}, m = "invokeSuspend")
public final class C403001hU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C403001hU(StickerEffectViewModel stickerEffectViewModel, String str, Function1<? super LiveEffect, Unit> function1, String str2, InterfaceC1364105Vn<? super C403001hU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C403001hU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEcEffectHelper@723a.queryStickerEffect$1$1");
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
            C403101hV c403101hV = C403101hV.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c403101hV, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEcEffectHelper@723a.queryStickerEffect$1$1");
                return objLJFF;
            }
        }
        final C013C c013c = new C013C();
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
        final String str = this.LLILLL;
        final Function1<LiveEffect, Unit> function1 = this.LLILZ;
        final String str2 = this.LLILZIL;
        InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01hW
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj2;
                Object obj3 = null;
                if (abstractC401801hI instanceof C403601ha) {
                    if (!c013c.element) {
                        List<C0U74<T>> list = ((C403601ha) abstractC401801hI).LIZ;
                        ArrayList arrayList = new ArrayList();
                        Iterator<C0U74<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI(it2.next().LIZIZ, arrayList);
                        }
                        String str3 = str2;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str3)) {
                                obj3 = next;
                                break;
                            }
                        }
                        LiveEffect liveEffect = (LiveEffect) obj3;
                        C20441214yg.LIZIZ("LiveEcEffectHelper", "query sticker effect and filter the target effect is " + liveEffect);
                        if (liveEffect != null) {
                            liveEffect.LJIIJJI(str);
                        }
                        function1.invoke(liveEffect);
                        c013c.element = true;
                    }
                } else if (abstractC401801hI instanceof C396001gM) {
                    C396001gM c396001gM = (C396001gM) abstractC401801hI;
                    if (Intrinsics.LJFF(c396001gM.LIZ, str) && !c013c.element) {
                        List<T> list2 = c396001gM.LIZIZ;
                        String str4 = str2;
                        Iterator<T> it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next2 = it4.next();
                            if (Intrinsics.LJFF(((LiveEffect) next2).getResourceId(), str4)) {
                                obj3 = next2;
                                break;
                            }
                        }
                        LiveEffect liveEffect2 = (LiveEffect) obj3;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("query sticker effect with category ");
                        sbLIZ.append(str);
                        sbLIZ.append(" and filter the target effect is ");
                        sbLIZ.append(liveEffect2);
                        C20441214yg.LIZIZ("LiveEcEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
                        if (liveEffect2 != null) {
                            liveEffect2.LJIIJJI(str);
                        }
                        function1.invoke(liveEffect2);
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
                        function1.invoke(null);
                        Throwable th = new Throwable();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('[');
                        sbLIZ3.append(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurrentRegionCode());
                        sbLIZ3.append("] query sticker effect");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(" and got error: ");
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
            C1C7U.LIZIZ("LiveEcEffectHelper@723a.queryStickerEffect$1$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
