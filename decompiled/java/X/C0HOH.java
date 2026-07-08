package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HOH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onPageResume$3$2", f = "MixStudioHomePageAssem.kt", l = {1415}, m = "invokeSuspend")
public final class C0HOH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ MixStudioHomePageAssem LLILZ;
    public final /* synthetic */ C0HOC LLILZIL;
    public final /* synthetic */ InterfaceC440090HNn LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOH(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, C013C c013c, MixStudioHomePageAssem mixStudioHomePageAssem, C0HOC c0hoc, InterfaceC440090HNn interfaceC440090HNn, C013C c013c2, C013C c013c3, C013C c013c4, InterfaceC1364105Vn<? super C0HOH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC440230HOb;
        this.LLILLL = c013c;
        this.LLILZ = mixStudioHomePageAssem;
        this.LLILZIL = c0hoc;
        this.LLILZLL = interfaceC440090HNn;
        this.LLIZ = c013c2;
        this.LLIZLLLIL = c013c3;
        this.LLJ = c013c4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.onPageResume$3$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<C0HOM<? extends Object>> state = this.LLILLJJLI.getState();
            final C013C c013c = this.LLILLL;
            final MixStudioHomePageAssem mixStudioHomePageAssem = this.LLILZ;
            final C0HOC c0hoc = this.LLILZIL;
            final InterfaceC440090HNn interfaceC440090HNn = this.LLILZLL;
            final InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = this.LLILLJJLI;
            final C013C c013c2 = this.LLIZ;
            final C013C c013c3 = this.LLIZLLLIL;
            final C013C c013c4 = this.LLJ;
            InterfaceC346701Wf<? super C0HOM<? extends Object>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0HOY
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String str;
                    FriendsIDInfo friendsIDInfo;
                    C0H7H c0h7h;
                    int i2;
                    C0HGY c0hgyLJIILIIL;
                    String strLJIIL;
                    String str2;
                    Integer numLJ;
                    int iIntValue;
                    String strLIZLLL;
                    Integer numLJIILL;
                    FriendsIDInfo friendsIDInfo2;
                    if (!c013c.element && (obj2 instanceof C1372405Ys)) {
                        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2 = mixStudioHomePageAssem.mp().getState().LLILLJJLI;
                        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3 = mixStudioHomePageAssem.mp().getState().LLILLL;
                        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4 = mixStudioHomePageAssem.mp().getState().LLILZ;
                        C440370HOp c440370HOp = C440370HOp.LIZ;
                        EnumC441640HTm enumC441640HTmVQ2 = mixStudioHomePageAssem.hp().vQ2();
                        boolean zIsNewUser = mixStudioHomePageAssem.hp().isNewUser();
                        C0HOC c0hoc2 = c0hoc;
                        if (c0hoc2 != null) {
                            c0h7h = c0hoc2.LIZIZ;
                        } else {
                            c0h7h = null;
                        }
                        C0H7H c0h7h2 = C0H7H.PREFILL;
                        if (c0h7h == c0h7h2) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        boolean z = mixStudioHomePageAssem.mp().getState().LLIZLLLIL;
                        InterfaceC440090HNn interfaceC440090HNn2 = interfaceC440090HNn;
                        if (interfaceC440090HNn2 != null) {
                            c440370HOp.getClass();
                            c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn2);
                        } else {
                            c0hgyLJIILIIL = null;
                        }
                        InterfaceC440090HNn interfaceC440090HNn3 = interfaceC440090HNn;
                        if (interfaceC440090HNn3 != null) {
                            c440370HOp.getClass();
                            strLJIIL = C440370HOp.LJIIL(interfaceC440090HNn3);
                        } else {
                            strLJIIL = null;
                        }
                        C440500HPc c440500HPcUp = mixStudioHomePageAssem.up();
                        if (c440500HPcUp != null && (friendsIDInfo2 = c440500HPcUp.LLJ) != null) {
                            str2 = friendsIDInfo2.chatType;
                        } else {
                            str2 = null;
                        }
                        String strLIZLLL2 = interfaceC440230HOb.LIZLLL();
                        if (C0H6Q.LIZ()) {
                            numLJ = C2286608xc.LJ(mixStudioHomePageAssem.op().wQ2());
                        } else {
                            Integer numLIZ = interfaceC440230HOb2.LIZ();
                            if (numLIZ != null) {
                                int iIntValue2 = numLIZ.intValue();
                                Integer numLIZ2 = interfaceC440230HOb3.LIZ();
                                if (numLIZ2 != null) {
                                    iIntValue = numLIZ2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                numLJ = C2286608xc.LJ(iIntValue2 + iIntValue);
                            } else {
                                numLJ = null;
                            }
                        }
                        Integer numLIZJ = interfaceC440230HOb.LIZJ();
                        if (C0H6Q.LIZ()) {
                            strLIZLLL = mixStudioHomePageAssem.op().zQ2();
                        } else {
                            strLIZLLL = interfaceC440230HOb4.LIZLLL();
                        }
                        InterfaceC440090HNn interfaceC440090HNn4 = interfaceC440090HNn;
                        if (interfaceC440090HNn4 != null) {
                            c440370HOp.getClass();
                            numLJIILL = C440370HOp.LJIILL(interfaceC440090HNn4);
                        } else {
                            numLJIILL = null;
                        }
                        c440370HOp.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C441660HTo.LIZ(c2344009Gk, enumC441640HTmVQ2);
                        c2344009Gk.LIZJ(zIsNewUser ? 1 : 0, "is_new_user");
                        c2344009Gk.LIZJ(i2, "is_prefill");
                        if (c0hgyLJIILIIL != null) {
                            c2344009Gk.LJFF("element", c0hgyLJIILIIL.getParam());
                        }
                        if (i2 != 0) {
                            c2344009Gk.LJFF("element_provider", c0h7h2.getParam());
                        }
                        if (strLJIIL != null) {
                            c2344009Gk.LJFF("element_id", strLJIIL);
                        }
                        if (z) {
                            c2344009Gk.LIZJ(1, "has_generation_history");
                        }
                        if (str2 != null) {
                            c2344009Gk.LJFF("chat_type", str2);
                        }
                        if (strLIZLLL2 != null) {
                            c2344009Gk.LJFF("selected_id", strLIZLLL2);
                        }
                        if (numLJ != null) {
                            c2344009Gk.LIZJ(numLJ.intValue(), "available_id_cnt");
                        }
                        if (numLIZJ != null) {
                            c2344009Gk.LIZJ(numLIZJ.intValue(), "selected_id_cnt");
                        }
                        if (strLIZLLL != null) {
                            c2344009Gk.LJFF("default_id", strLIZLLL);
                        }
                        if (numLJIILL != null) {
                            c2344009Gk.LIZJ(numLJIILL.intValue(), "sticker_type");
                        }
                        C20684815ws.LJIILLIIL("imagine_studio_enter_creation_panel", c2344009Gk.LIZ);
                        c013c.element = true;
                        c013c2.element = false;
                        c013c3.element = false;
                    } else if (!c013c2.element && (obj2 instanceof C0HKV)) {
                        C440370HOp c440370HOp2 = C440370HOp.LIZ;
                        EnumC441640HTm enumC441640HTmVQ22 = mixStudioHomePageAssem.hp().vQ2();
                        c440370HOp2.getClass();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        C441660HTo.LIZ(c2344009Gk2, enumC441640HTmVQ22);
                        C20684815ws.LJIILLIIL("imagine_studio_enter_generating_avatar_panel", c2344009Gk2.LIZ);
                        c013c.element = false;
                        c013c2.element = true;
                        c013c3.element = false;
                    } else if (!c013c3.element && (Intrinsics.LJFF(obj2, C1372505Yt.LIZIZ) || Intrinsics.LJFF(obj2, C0HON.LIZIZ))) {
                        C440370HOp c440370HOp3 = C440370HOp.LIZ;
                        EnumC441640HTm enumC441640HTmVQ23 = mixStudioHomePageAssem.hp().vQ2();
                        EnumC440250HOd enumC440250HOd = EnumC440250HOd.SHOW;
                        C440500HPc c440500HPcUp2 = mixStudioHomePageAssem.up();
                        if (c440500HPcUp2 != null && (friendsIDInfo = c440500HPcUp2.LLJ) != null) {
                            str = friendsIDInfo.chatType;
                        } else {
                            str = null;
                        }
                        c440370HOp3.getClass();
                        C440370HOp.LJI(enumC441640HTmVQ23, enumC440250HOd, str);
                        c013c.element = false;
                        c013c2.element = false;
                        c013c3.element = true;
                    } else if (!c013c4.element && (obj2 instanceof C05Z7)) {
                        C440370HOp c440370HOp4 = C440370HOp.LIZ;
                        EnumC441640HTm enumC441640HTmVQ24 = mixStudioHomePageAssem.hp().vQ2();
                        c440370HOp4.getClass();
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTmVQ24).getParam());
                        C20684815ws.LJIILLIIL("imagine_studio_enter_upgrade_image_panel", c2344009Gk3.LIZ);
                        c013c4.element = true;
                        c013c.element = false;
                        c013c2.element = false;
                        c013c3.element = false;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (state.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onPageResume$3$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
