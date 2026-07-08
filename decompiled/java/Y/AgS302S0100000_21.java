package Y;

import X.AbstractC1340120kyg;
import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C0BJA;
import X.C0XQ7;
import X.C1339430kxZ;
import X.C1339910kyL;
import X.C1340020kyW;
import X.C1340030kyX;
import X.C1342220l24;
import X.C1353360lK2;
import X.C1353740lKe;
import X.C1363970lb9;
import X.C1364170lbT;
import X.C1388670mEz;
import X.C1388740mF6;
import X.C1388820mFE;
import X.C1954807lC;
import X.C23250099c;
import X.C786410Ut5;
import X.C866950Xzh;
import X.C912690ZrH;
import X.EnumC1364060lbI;
import X.EnumC1364240lba;
import X.InterfaceC1339640kxu;
import X.InterfaceC1339670kxx;
import X.InterfaceC1339720ky2;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.animation.AnimatorSet;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AgS302S0100000_21 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS302S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C1388820mFE) agS302S0100000_21.l0).LJIIL(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ArrayList arrayList;
        List list = (List) obj;
        if (C866950Xzh.LIZIZ(list)) {
            if (list != null) {
                C1388820mFE c1388820mFE = (C1388820mFE) agS302S0100000_21.l0;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C1388670mEz c1388670mEz = (C1388670mEz) obj2;
                    IIMAnonymousService iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
                    if (iIMAnonymousService != null) {
                        String str = c1388820mFE.LIZJ;
                        String uid = c1388670mEz.LIZ.getUid();
                        if (uid == null) {
                            uid = "";
                        }
                        if (iIMAnonymousService.LIZLLL(str, uid, false)) {
                        }
                    }
                    arrayList.add(obj2);
                }
            } else {
                arrayList = null;
            }
            ((C1388820mFE) agS302S0100000_21.l0).LJIILIIL.LLLI(arrayList);
            AnonymousClass0956 anonymousClass0956 = ((C1388820mFE) agS302S0100000_21.l0).LJIILL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1388820mFE c1388820mFE2 = (C1388820mFE) agS302S0100000_21.l0;
            c1388820mFE2.LJIILL = C23250099c.LIZLLL(c1388820mFE2.LJIILJJIL, null, null, new C1388740mF6(c1388820mFE2, list, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        ((C1388820mFE) agS302S0100000_21.l0).LIZLLL.LIZ((String) pair.getFirst(), (String) pair.getSecond());
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C1388820mFE) agS302S0100000_21.l0).LJIIIZ(null);
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C1388820mFE) agS302S0100000_21.l0).show();
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String authorUid;
        Function1<? super String, Unit> function1;
        C1339430kxZ c1339430kxZ;
        Function1<? super String, Unit> function12;
        String string;
        Context context;
        AbstractC1340120kyg abstractC1340120kyg = (AbstractC1340120kyg) obj;
        ((C1339430kxZ) agS302S0100000_21.l0).getClass();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        Aweme aweme = ((C1339430kxZ) agS302S0100000_21.l0).LJIILL;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C0BJA.LIZ(((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid))) {
            if (Intrinsics.LJFF(abstractC1340120kyg, C1340030kyX.LIZIZ) && (function12 = (c1339430kxZ = (C1339430kxZ) agS302S0100000_21.l0).LJJ) != null) {
                C1353360lK2 c1353360lK2 = c1339430kxZ.LJJIFFI;
                if (c1353360lK2 != null && (context = c1353360lK2.getContext()) != null) {
                    string = context.getString(2131829257);
                } else {
                    string = null;
                }
                function12.invoke(string);
            }
            if ((abstractC1340120kyg instanceof C1340020kyW) && ((C1340020kyW) abstractC1340120kyg).LIZJ && (function1 = ((C1339430kxZ) agS302S0100000_21.l0).LJJ) != null) {
                function1.invoke(null);
            }
            InterfaceC1339670kxx interfaceC1339670kxx = (InterfaceC1339670kxx) ((C1339430kxZ) agS302S0100000_21.l0).LJ.getValue();
            if (interfaceC1339670kxx != null) {
                interfaceC1339670kxx.setTranslationState(null);
            }
        } else {
            InterfaceC1339670kxx interfaceC1339670kxx2 = (InterfaceC1339670kxx) ((C1339430kxZ) agS302S0100000_21.l0).LJ.getValue();
            if (interfaceC1339670kxx2 != null) {
                interfaceC1339670kxx2.setTranslationState(abstractC1340120kyg);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        String authorUid;
        String string;
        String authorUid2;
        String groupId;
        C912690ZrH c912690ZrH = (C912690ZrH) obj;
        Comment comment = ((C1339430kxZ) agS302S0100000_21.l0).LJIILJJIL;
        if (comment != null && Intrinsics.LJFF(c912690ZrH.LIZJ, comment.getCid())) {
            C1339430kxZ c1339430kxZ = (C1339430kxZ) agS302S0100000_21.l0;
            c1339430kxZ.LJII = c912690ZrH;
            if (c912690ZrH.LJ && c912690ZrH.LIZ != null) {
                Comment comment2 = c1339430kxZ.LJIILJJIL;
                if (comment2 != null) {
                    comment2.setTranslated(true);
                    Function0<Unit> function0 = c1339430kxZ.LJJI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                    Aweme aweme = c1339430kxZ.LJIILL;
                    if (aweme != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme);
                    } else {
                        authorUid = null;
                    }
                    boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
                    if (c1339430kxZ.LIZIZ() && C0BJA.LIZ(zLIZJ)) {
                        string = c1339430kxZ.LJIILLIIL.getString(2131829256);
                    } else {
                        string = null;
                    }
                    C1339910kyL c1339910kyL = c1339430kxZ.LJFF;
                    if (c1339910kyL != null) {
                        String str = c912690ZrH.LIZ;
                        if (str != null) {
                            List<TextExtraStruct> list = c912690ZrH.LIZIZ;
                            if (list != null) {
                                Boolean boolValueOf = Boolean.valueOf(zLIZJ);
                                Context context = c1339430kxZ.LJIILLIIL;
                                Boolean boolValueOf2 = Boolean.valueOf(!c1339430kxZ.LJIIZILJ);
                                int i = c1339430kxZ.LJIIL;
                                int i2 = c1339430kxZ.LJIILIIL;
                                String str2 = c1339430kxZ.LJIIJJI;
                                Aweme aweme2 = c1339430kxZ.LJIILL;
                                if (aweme2 != null) {
                                    authorUid2 = AwemeExtKt.getAuthorUid(aweme2);
                                } else {
                                    authorUid2 = null;
                                }
                                Aweme aweme3 = c1339430kxZ.LJIILL;
                                if (aweme3 != null) {
                                    groupId = aweme3.getGroupId();
                                } else {
                                    groupId = null;
                                }
                                C1353740lKe c1353740lKe = new C1353740lKe(i, i2, str2, authorUid2, groupId);
                                CharSequence charSequenceLJI = C1342220l24.LJI(comment2, str, list, true, context);
                                List<TextExtraStruct> listLIZ = C1342220l24.LIZ(comment2, str, list, context);
                                if (boolValueOf2.booleanValue()) {
                                    c1339910kyL.LIZJ(comment2, charSequenceLJI, listLIZ, boolValueOf, string, c1353740lKe);
                                } else {
                                    AnimatorSet animatorSet = c1339910kyL.LIZLLL;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        c1339910kyL.LIZLLL = null;
                                    }
                                    c1339910kyL.LJ(comment2, charSequenceLJI, listLIZ, string, c1353740lKe);
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    InterfaceC1339720ky2 interfaceC1339720ky2 = c1339430kxZ.LJIIIIZZ;
                    if (interfaceC1339720ky2 != null) {
                        interfaceC1339720ky2.Fm0(comment2);
                    }
                }
            } else {
                Comment comment3 = c1339430kxZ.LJIILJJIL;
                if (comment3 != null) {
                    comment3.setTranslated(false);
                    InterfaceC1339720ky2 interfaceC1339720ky22 = c1339430kxZ.LJIIIIZZ;
                    if (interfaceC1339720ky22 != null) {
                        interfaceC1339720ky22.yV1(comment3);
                    }
                    C1339910kyL c1339910kyL2 = c1339430kxZ.LJFF;
                    if (c1339910kyL2 != null) {
                        C1339910kyL.LIZIZ(c1339910kyL2.LIZ);
                    }
                }
                Function1<? super String, Unit> function1 = ((C1339430kxZ) agS302S0100000_21.l0).LJJ;
                if (function1 != null) {
                    function1.invoke(null);
                }
            }
            ((C1339430kxZ) agS302S0100000_21.l0).LJIIZILJ = false;
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJIIJJI;
        String aid;
        InterfaceC1339670kxx interfaceC1339670kxx = (InterfaceC1339670kxx) ((C1339430kxZ) agS302S0100000_21.l0).LJ.getValue();
        if (interfaceC1339670kxx != null) {
            C1339430kxZ c1339430kxZ = (C1339430kxZ) agS302S0100000_21.l0;
            InterfaceC1339640kxu interfaceC1339640kxu = c1339430kxZ.LJI;
            if (interfaceC1339640kxu != null) {
                zLJIIJJI = interfaceC1339640kxu.LJIIJJI(c1339430kxZ.LJIILJJIL);
            } else {
                zLJIIJJI = false;
            }
            Aweme aweme = ((C1339430kxZ) agS302S0100000_21.l0).LJIILL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            interfaceC1339670kxx.setTranslationState(new C1340020kyW(zLJIIJJI, false, aid));
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iOrdinal = ((EnumC1364240lba) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C786410Ut5.LJLLLLLL(0, ((C1364170lbT) agS302S0100000_21.l0).LLILZLL);
                ((C1364170lbT) agS302S0100000_21.l0).LLILZLL.setSelected(true);
                ((C1364170lbT) agS302S0100000_21.l0).LLILZLL.setChecked(true);
                C786410Ut5.LJLLLLLL(8, ((C1364170lbT) agS302S0100000_21.l0).LLIZ);
            } else {
                throw new C1954807lC();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, ((C1364170lbT) agS302S0100000_21.l0).LLILZLL);
            C786410Ut5.LJLLLLLL(0, ((C1364170lbT) agS302S0100000_21.l0).LLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS302S0100000_21 agS302S0100000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iOrdinal = ((EnumC1364060lbI) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C786410Ut5.LJLLLLLL(0, ((C1363970lb9) agS302S0100000_21.l0).LLILZ);
                ((C1363970lb9) agS302S0100000_21.l0).LLILZ.setSelected(true);
                ((C1363970lb9) agS302S0100000_21.l0).LLILZ.setChecked(true);
                C786410Ut5.LJLLLLLL(8, ((C1363970lb9) agS302S0100000_21.l0).LLILZIL);
            } else {
                throw new C1954807lC();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, ((C1363970lb9) agS302S0100000_21.l0).LLILZ);
            C786410Ut5.LJLLLLLL(8, ((C1363970lb9) agS302S0100000_21.l0).LLILZIL);
        }
        return Unit.LIZ;
    }
}
