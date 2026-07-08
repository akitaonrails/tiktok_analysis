package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ixn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262690ixn implements InterfaceC1264190j0D {
    public static final C1262690ixn LIZ = new C1262690ixn();

    @Override // X.InterfaceC1264190j0D
    public final Class<?> LIZLLL() {
        return C1262970iyF.class;
    }

    @Override // X.InterfaceC1264190j0D
    public final void LIZ(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        int i = 0;
        C1904430zer.LJI.putAll(C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.elw), "relation_usercard_title_item"), new Pair(Integer.valueOf(R.layout.ele), "relation_rec_user_card_rectangle")));
        int[] iArr = {R.layout.elw, R.layout.ele, R.layout.ele, R.layout.ele};
        if (((Boolean) C1904430zer.LIZJ.getValue()).booleanValue() && !c19eg.isFinishing()) {
            do {
                int i2 = iArr[i];
                C20673215v0.LJI(i2, c19eg);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preInflate layout id = ");
                sbLIZ.append((String) ((LinkedHashMap) C1904430zer.LJI).get(Integer.valueOf(i2)));
                C1720106oR.LJI("InboxJankOptimizationV3", C2188811AlT.LIZIZ(sbLIZ));
                i++;
            } while (i < 4);
        }
    }

    @Override // X.InterfaceC1264190j0D
    public final AbstractC1906720ziY LIZJ(final C1262670ixl c1262670ixl) {
        Object objLJ;
        AbstractC1263540izA abstractC1263540izA;
        Object objLJ2;
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(c1262670ixl, 668);
        Fragment fragment = c1262670ixl.LIZ;
        int i = 5;
        if (fragment != null) {
            C1262310ixB c1262310ixB = new C1262310ixB(null, fragment, 1);
            awS598S0100000_19.invoke(c1262310ixB);
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
            C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
            if (c1262320ixC.LIZLLL == -1) {
                int i2 = c1262310ixB.LJFF.LIZJ - 10;
                if (i2 >= 5) {
                    i = i2;
                }
                c1262320ixC.LIZLLL = i;
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263540izA.class);
            if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                C1262590ixd c1262590ixd = c1262310ixB.LJFF;
                if (c1262590ixd.LJIILJJIL == null) {
                    c1262590ixd.LJIILJJIL = Boolean.TRUE;
                }
            }
            C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263540izA.class);
            if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
                objLJ2 = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (objLJ2 != null) {
                abstractC1263540izA = (AbstractC1263540izA) objLJ2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationAuthCardChunk");
            }
        } else {
            C19EG c19eg = c1262670ixl.LIZIZ;
            if (c19eg != null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
                if (c19egLIZIZ != null) {
                    C1262310ixB c1262310ixB2 = new C1262310ixB(c19egLIZIZ, null, 2);
                    awS598S0100000_19.invoke(c1262310ixB2);
                    IRelationUserCardInternalService.LIZ.getClass();
                    IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ2 = C1073940e3M.LIZ();
                    C1262320ixC c1262320ixC2 = c1262310ixB2.LIZLLL;
                    if (c1262320ixC2.LIZLLL == -1) {
                        int i3 = c1262310ixB2.LJFF.LIZJ - 10;
                        if (i3 >= 5) {
                            i = i3;
                        }
                        c1262320ixC2.LIZLLL = i;
                    }
                    C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(AbstractC1263540izA.class);
                    if (!Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ3, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                        C1262590ixd c1262590ixd2 = c1262310ixB2.LJFF;
                        if (c1262590ixd2.LJIILJJIL == null) {
                            c1262590ixd2.LJIILJJIL = Boolean.TRUE;
                        }
                    }
                    C1262300ixA c1262300ixA2 = new C1262300ixA(c1262310ixB2.LIZ, c1262310ixB2.LIZIZ, c1262310ixB2.LIZJ, c1262310ixB2.LIZLLL, c1262310ixB2.LJ, c1262310ixB2.LJFF, null, c1262310ixB2.LJI);
                    C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(AbstractC1263540izA.class);
                    if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(C1262790ixx.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LIZ(c1262300ixA2, 1).getLayout();
                    } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(C1262780ixw.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LIZ(c1262300ixA2, 0).getLayout();
                    } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1263550izB.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LIZIZ(c1262300ixA2);
                    } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1890380zIC.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LIZJ(c1262300ixA2);
                    } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1903730zdj.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LIZLLL(c1262300ixA2);
                    } else if (Intrinsics.LJFF(c19719912DlLIZ4, C13LE.LIZ(AbstractC1263540izA.class))) {
                        objLJ = iRelationUserCardInternalServiceLIZ2.LJ(c1262300ixA2);
                    } else {
                        "type is error!".toString();
                        throw new IllegalStateException("type is error!");
                    }
                    if (objLJ != null) {
                        abstractC1263540izA = (AbstractC1263540izA) objLJ;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationAuthCardChunk");
                    }
                } else {
                    "current context is not fragmentActivity!".toString();
                    throw new IllegalStateException("current context is not fragmentActivity!");
                }
            } else {
                "config not attach host!".toString();
                throw new IllegalStateException("config not attach host!");
            }
        }
        ((C1262990iyH) abstractC1263540izA).LJI(null);
        C1262990iyH c1262990iyH = (C1262990iyH) abstractC1263540izA;
        c1262990iyH.LLFZ(false);
        c1262990iyH.Eg(new InterfaceC1261750iwH() { // from class: X.0ixm
            @Override // X.InterfaceC1261750iwH
            public final void LLF(RecyclerView recyclerView, int i4) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                Function1<AbstractC1261460ivo<?>, Unit> function1 = c1262670ixl.LJI;
                if (function1 != null) {
                    function1.invoke(abstractC1261460ivo);
                }
            }

            @Override // X.InterfaceC1261750iwH
            public final void nO0(C1075800e6M c1075800e6M) {
                Function1<C1075800e6M, Unit> function1 = c1262670ixl.LJII;
                if (function1 != null) {
                    function1.invoke(c1075800e6M);
                }
            }
        });
        return abstractC1263540izA;
    }

    @Override // X.InterfaceC1264190j0D
    public final FrameLayout LIZIZ(C19EG c19eg, String str, boolean z) {
        String str2;
        C0DLC c0dlc = new C0DLC(c19eg);
        TuxTextView tuxTextView = c0dlc.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1608090rwt c1608090rwt = C1608090rwt.LIZIZ;
        Context context = c0dlc.getContext();
        String str3 = "feed_pop_up";
        if (C296530Bjn.LIZ()) {
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                str2 = "feed_pop_up";
            } else {
                str2 = "pop_up";
            }
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1608090rwt.LJIIIIZZ(context, null, null, null, 72, str2, "", z ? 1 : 0, AFwS207S0000000_19.get$arr$(294)));
        if (C296530Bjn.LIZ()) {
            if (!Intrinsics.LJFF(str, "homepage_hot")) {
                str3 = "pop_up";
            }
            C444940Hca c444940Hca = new C444940Hca();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(c0dlc.getContext().getString(2131838209));
            c444940Hca.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(72);
            c444940Hca.LJIIIIZZ = new AwS168S1100000_19(str3, c0dlc, 0);
            spannableStringBuilder.append(c444940Hca.LIZ(c0dlc.getContext()));
        }
        tuxTextView.setText(spannableStringBuilder);
        return c0dlc;
    }

    @Override // X.InterfaceC1264190j0D
    public final void LJ(Context context, User user, String str, String str2, String str3, String str4, String str5) {
        EnumC1260920iuw enumC1260920iuw;
        EnumC1260920iuw[] enumC1260920iuwArrValues = EnumC1260920iuw.values();
        int length = enumC1260920iuwArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC1260920iuw = enumC1260920iuwArrValues[i];
                if (Intrinsics.LJFF(enumC1260920iuw.getType(), str5)) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC1260920iuw = null;
                break;
            }
        }
        C1263950izp.LIZIZ(user, context, str, str2, str3, str4, enumC1260920iuw, false, null, null, null, null, null, null, false, null, 0, null, 524224);
    }
}
