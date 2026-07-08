package X;

import Y.ACListenerS122S0200000_19;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS52S0300000_19;
import Y.ARunnableS88S0200000_19;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationInputAnswerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.navbar.ProfileScrollNavbarAnimation;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileAITheaterCellAssem;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS135S1200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0j2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnLayoutChangeListenerC1265870j2v implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1265870j2v(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        GroupInvitationInputAnswerAssem groupInvitationInputAnswerAssem = (GroupInvitationInputAnswerAssem) viewOnLayoutChangeListenerC1265870j2v.l0;
        if (groupInvitationInputAnswerAssem.LLJI && groupInvitationInputAnswerAssem.LLJ > 0 && (tuxTextView = groupInvitationInputAnswerAssem.LLJJIII) != null) {
            int[] iArr = new int[2];
            tuxTextView.getLocationOnScreen(iArr);
            int height = iArr[1] + tuxTextView.getHeight();
            View viewLJJIJL = groupInvitationInputAnswerAssem.LJJIJL();
            int[] iArr2 = new int[2];
            viewLJJIJL.getLocationOnScreen(iArr2);
            int height2 = groupInvitationInputAnswerAssem.LLJ - ((iArr2[1] + viewLJJIJL.getHeight()) - height);
            C118300cf c118300cf = new C118300cf();
            if (height2 >= 0) {
                groupInvitationInputAnswerAssem.LLJIJIL += height2;
                c118300cf.element = height2;
            } else {
                int i9 = groupInvitationInputAnswerAssem.LLJIJIL;
                int i10 = height2 + i9;
                int i11 = groupInvitationInputAnswerAssem.LLJ;
                if (i10 < i11) {
                    i10 = i11;
                }
                c118300cf.element = i10 - i9;
                groupInvitationInputAnswerAssem.LLJIJIL = i10;
            }
            if (c118300cf.element != 0 && (tuxTextView2 = (TuxTextView) groupInvitationInputAnswerAssem.LLJILLL.getValue()) != null) {
                HandlerHook.viewPost(tuxTextView2, new ARunnableS52S0300000_19(tuxTextView2, groupInvitationInputAnswerAssem, c118300cf, 9));
            }
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer numValueOf;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265870j2v);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissAnimationEnd show visible: ");
        View view2 = ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0).LLJLLIL;
        Integer numValueOf2 = null;
        if (view2 != null) {
            numValueOf = Integer.valueOf(view2.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("， navbarView width =");
        View view3 = ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0).LLJLLIL;
        if (view3 != null) {
            numValueOf2 = Integer.valueOf(view3.getWidth());
        }
        sbLIZ.append(numValueOf2);
        C1720106oR.LJI("ProfileScrollNavbarAnimation", C2188811AlT.LIZIZ(sbLIZ));
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0), INavbarBaseAbility.class, EnumC1249130ibv.CENTER_AREA.getValue());
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.UI1(false, true);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer numValueOf;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265870j2v);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimationStart show  visbile: ");
        View view2 = ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0).LLJLLIL;
        Integer numValueOf2 = null;
        if (view2 != null) {
            numValueOf = Integer.valueOf(view2.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("， navbarView width =");
        View view3 = ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0).LLJLLIL;
        if (view3 != null) {
            numValueOf2 = Integer.valueOf(view3.getWidth());
        }
        sbLIZ.append(numValueOf2);
        C1720106oR.LJI("ProfileScrollNavbarAnimation", C2188811AlT.LIZIZ(sbLIZ));
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0), INavbarBaseAbility.class, EnumC1249130ibv.CENTER_AREA.getValue());
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.UI1(false, true);
        }
        ((ValueAnimator) ((ProfileScrollNavbarAnimation) viewOnLayoutChangeListenerC1265870j2v.l0).LLLFFI.getValue()).start();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265870j2v);
        EditProfileAITheaterCellAssem editProfileAITheaterCellAssem = (EditProfileAITheaterCellAssem) viewOnLayoutChangeListenerC1265870j2v.l0;
        C127K c127k = editProfileAITheaterCellAssem.LLJI;
        if (c127k != null) {
            c127k.setBackground(editProfileAITheaterCellAssem.Go());
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        User curUser;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        String curUserId;
        if ((i != i5 || i2 != i6 || i4 != i8 || i3 != i7) && (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null) {
            EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) viewOnLayoutChangeListenerC1265870j2v.l0;
            String uid = curUser.getUid();
            if (uid != null && C1215840hkE.LIZ() && editProfileBioCellAssem.LLJILLL == null && curUser.getAccountType() != 3) {
                Keva keva = C1215860hkG.LIZ;
                if (keva.getInt(C1215860hkG.LIZ(uid), 0) < 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("last_time_tooltip_shown_");
                    sbLIZ.append(uid);
                    if (System.currentTimeMillis() - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) > 86400000) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("is_mention_in_bio_function_used_");
                        sbLIZ2.append(uid);
                        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false) && (linearLayout = editProfileBioCellAssem.LLJIJIL) != null && (tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.z31)) != null && (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != null) {
                            C450650Hln c450650Hln = new C450650Hln(tuxTextView.getContext());
                            c450650Hln.LIZLLL(c450650Hln.getResources().getString(2131824920), 2);
                            c450650Hln.LIZ(0);
                            C1391550mJd c1391550mJd = new C1391550mJd(tuxTextView.getContext());
                            c1391550mJd.LLILLJJLI.LJIIZILJ = c450650Hln;
                            c1391550mJd.LIZLLL();
                            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                            c1391600mJi.LIZIZ = tuxTextView;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                            c1391550mJd.LJI(C960203pA.LIZ(R.attr.a0d, tuxTextView.getContext()));
                            c1391550mJd.LLILLJJLI.LJIJJ = false;
                            c1391550mJd.LJIIIZ(true, new ACListenerS122S0200000_19(editProfileBioCellAssem, tuxTextView, 58));
                            c1391550mJd.LJ(new AwS135S1200000_19(editProfileBioCellAssem, tuxTextView, curUserId, 5));
                            c1391550mJd.LIZJ(new AwS598S0100000_19(editProfileBioCellAssem, 695));
                            c1391550mJd.LLILLJJLI.LJII = -1001L;
                            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
                            if (tuxTextView.getParent() != null) {
                                HandlerHook.viewPost(tuxTextView, new ARunnableS88S0200000_19(tuxTextView, c0p0tLIZIZ, 49));
                            }
                            C786410Ut5.LJLIIL(2000L, new BPEAHandler(), new ARunnableS109S0100000_9(c0p0tLIZIZ, 182));
                            editProfileBioCellAssem.LLJILLL = c0p0tLIZIZ;
                        }
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        User curUser;
        C127K c127k;
        String curUserId;
        float length;
        float width;
        int i9;
        C11G3 c11g3;
        TextPaint paint;
        Float fValueOf;
        if ((i != i5 || i2 != i6 || i4 != i8 || i3 != i7) && (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null) {
            EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) viewOnLayoutChangeListenerC1265870j2v.l0;
            String uid = curUser.getUid();
            if (uid != null && C1215840hkE.LIZ() && editProfileBioCellAssem.LLJILLL == null && curUser.getAccountType() != 3) {
                Keva keva = C1215860hkG.LIZ;
                if (keva.getInt(C1215860hkG.LIZ(uid), 0) < 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("last_time_tooltip_shown_");
                    sbLIZ.append(uid);
                    if (System.currentTimeMillis() - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) > 86400000) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("is_mention_in_bio_function_used_");
                        sbLIZ2.append(uid);
                        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false) && (c127k = editProfileBioCellAssem.LLJI) != null && (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != null) {
                            C450650Hln c450650Hln = new C450650Hln(c127k.getContext());
                            c450650Hln.LIZLLL(c450650Hln.getResources().getString(2131824920), 2);
                            c450650Hln.LIZ(0);
                            String strLIZIZ = C1215970hkR.LIZIZ(c127k);
                            TextView textView = (TextView) c127k.findViewById(R.id.m4r);
                            if (textView != null && (paint = textView.getPaint()) != null && (fValueOf = Float.valueOf(paint.measureText(strLIZIZ, 0, strLIZIZ.length()))) != null) {
                                length = fValueOf.floatValue();
                            } else {
                                length = strLIZIZ.length() * ((TextView) c127k.findViewById(R.id.y3j)).getTextSize();
                            }
                            float fLIZ = C1216270hkv.LIZ(234);
                            float width2 = c127k.findViewById(R.id.dlh).getWidth();
                            float f = 16;
                            float fLIZ2 = C1216270hkv.LIZ(f);
                            float fLIZ3 = C1216270hkv.LIZ(f);
                            float fLIZ4 = C1216270hkv.LIZ(12);
                            C11G4 c11g4LIZ = C1215970hkR.LIZ(c127k);
                            if (c11g4LIZ != null && (c11g3 = c11g4LIZ.LIZIZ) != null) {
                                width = c11g3.getWidth();
                            } else {
                                width = 0.0f;
                            }
                            float f2 = width - fLIZ3;
                            float f3 = 2;
                            int i10 = (int) ((((width2 - fLIZ) / f3) - fLIZ2) - fLIZ4);
                            if (length >= fLIZ) {
                                i9 = i10;
                            } else {
                                i9 = (int) ((((width2 + f2) / f3) - width) - fLIZ2);
                            }
                            Pair pair = new Pair(Integer.valueOf(i10), Integer.valueOf(i9));
                            C1391550mJd c1391550mJd = new C1391550mJd(c127k.getContext());
                            c1391550mJd.LLILLJJLI.LJIIZILJ = c450650Hln;
                            c1391550mJd.LIZLLL();
                            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                            c1391600mJi.LIZIZ = c127k;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                            c1391550mJd.LJI(C960203pA.LIZ(R.attr.a0d, c127k.getContext()));
                            c1391550mJd.LLILLJJLI.LJFF = (int) C1216270hkv.LIZ(f);
                            c1391550mJd.LLILLJJLI.LJ = ((Number) pair.getFirst()).intValue();
                            int iIntValue = ((Number) pair.getSecond()).intValue();
                            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
                            c1391600mJi2.LJI = iIntValue;
                            c1391600mJi2.LJIJJ = false;
                            c1391550mJd.LJIIIZ(true, new ACListenerS122S0200000_19(editProfileBioCellAssem, c127k, 57));
                            c1391550mJd.LJ(new AwS135S1200000_19(editProfileBioCellAssem, c127k, curUserId, 4));
                            c1391550mJd.LIZJ(new AwS598S0100000_19(editProfileBioCellAssem, 694));
                            c1391550mJd.LLILLJJLI.LJII = -1001L;
                            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
                            if (c127k.getParent() != null) {
                                HandlerHook.viewPost(c127k, new ARunnableS88S0200000_19(c127k, c0p0tLIZIZ, 48));
                            }
                            C786410Ut5.LJLIIL(2000L, new BPEAHandler(), new ARunnableS109S0100000_9(c0p0tLIZIZ, 181));
                            editProfileBioCellAssem.LLJILLL = c0p0tLIZIZ;
                        }
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ProfileHeaderCTABaseComponent profileHeaderCTABaseComponent = (ProfileHeaderCTABaseComponent) viewOnLayoutChangeListenerC1265870j2v.l0;
        ViewGroup viewGroup = profileHeaderCTABaseComponent.LLJJIJIIJIL;
        if (viewGroup != null) {
            profileHeaderCTABaseComponent.LLLIIII = true;
            profileHeaderCTABaseComponent.Ep(viewGroup);
        }
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC1265870j2v viewOnLayoutChangeListenerC1265870j2v, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1228940i5M) viewOnLayoutChangeListenerC1265870j2v.l0).LIZ();
    }
}
