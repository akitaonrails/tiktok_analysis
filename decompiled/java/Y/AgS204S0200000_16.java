package Y;

import X.AbstractC1262120iws;
import X.C01GW;
import X.C1006120cHy;
import X.C1048570dOR;
import X.C1048600dOU;
import X.C1048720dOg;
import X.C1048750dOj;
import X.C1048780dOm;
import X.C1056330dax;
import X.C1056370db1;
import X.C1070110dxB;
import X.C1070130dxD;
import X.C1070150dxF;
import X.C1070170dxH;
import X.C1070290dxT;
import X.C1070310dxV;
import X.C1070520dxq;
import X.C1070540dxs;
import X.C1070760dyE;
import X.C1070780dyG;
import X.C1071240dz0;
import X.C1071260dz2;
import X.C1071540dzU;
import X.C1071570dzX;
import X.C1076010e6h;
import X.C1260220ito;
import X.C1260240itq;
import X.C1261770iwJ;
import X.C1261860iwS;
import X.C1262490ixT;
import X.C1263430iyz;
import X.C1264320j0Q;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1697810uHb;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2510609se;
import X.C438710HIf;
import X.C447550Hgn;
import X.C491101vh;
import X.C786410Ut5;
import X.EnumC1011130cQ3;
import X.EnumC1070340dxY;
import X.EnumC1070410dxf;
import X.InterfaceC1262230ix3;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public class AgS204S0200000_16 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS204S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC1070410dxf enumC1070410dxf;
        C1071570dzX c1071570dzX = (C1071570dzX) obj;
        if (C1056370db1.LIZ[c1071570dzX.LIZ.LIZIZ.ordinal()] == 1 && c1071570dzX.LIZ.LIZ.LIZJ) {
            FindFriendsPageVM findFriendsPageVM = (FindFriendsPageVM) agS204S0200000_16.l0;
            EnumC1070340dxY enumC1070340dxY = (EnumC1070340dxY) agS204S0200000_16.l1;
            findFriendsPageVM.getClass();
            int i = C1056330dax.LIZIZ[enumC1070340dxY.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unknown platform: ");
                        sbLIZ.append(enumC1070340dxY);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    enumC1070410dxf = EnumC1070410dxf.CONTACT;
                }
            } else {
                enumC1070410dxf = EnumC1070410dxf.FACEBOOK;
            }
            if (enumC1070410dxf != null) {
                ((FindFriendsPageVM) agS204S0200000_16.l0).UA0(enumC1070410dxf, "auto");
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        UrlModel urlModel = (UrlModel) obj;
        C1048750dOj c1048750dOj = (C1048750dOj) agS204S0200000_16.l0;
        SmartImageView smartImageView = c1048750dOj.LLJIJIL;
        if (smartImageView != null) {
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = (AdFollowUpAceSurveyVM) agS204S0200000_16.l1;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJL(c1048750dOj.LLILZLL);
            c1331670kl3LJIIIIZZ.LIZLLL("AdFollowUpAceSurveyView");
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJ(null);
            C786410Ut5.Q8(smartImageView, new ACListenerS151S0100000_16(adFollowUpAceSurveyVM, 7));
        }
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070130dxD.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("mlbb", false);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS204S0200000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$11(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070150dxF.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("facebook", false);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
                C1076010e6h.LIZJ.LJFF().LIZLLL(2, System.currentTimeMillis());
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS204S0200000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070170dxH.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("contact", false);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
                C1076010e6h.LIZJ.LJFF().LIZLLL(1, System.currentTimeMillis());
                C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LJFF(false);
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS204S0200000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$13(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJFF;
        boolean z;
        C1071570dzX c1071570dzX = (C1071570dzX) obj;
        if (((AuthCardListScopeAbility) agS204S0200000_16.l0).LLIZLLLIL.invoke().LIZ instanceof C491101vh) {
            return Unit.LIZ;
        }
        try {
            EnumC1070410dxf enumC1070410dxfLIZ = ((AuthCardListScopeAbility) agS204S0200000_16.l0).LIZ((EnumC1070340dxY) agS204S0200000_16.l1);
            boolean z2 = C1071540dzU.LIZIZ.LIZLLL(enumC1070410dxfLIZ).LIZ().LIZLLL;
            Bundle bundle = c1071570dzX.LIZIZ;
            int i = 0;
            if (bundle != null) {
                zLJFF = Intrinsics.LJFF(bundle.getString("from_myself"), ((AuthCardListScopeAbility) agS204S0200000_16.l0).LLJI);
            } else {
                zLJFF = false;
            }
            int i2 = C1070780dyG.LIZ[c1071570dzX.LIZ.LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 && z2) {
                    AuthCardListScopeAbility authCardListScopeAbility = (AuthCardListScopeAbility) agS204S0200000_16.l0;
                    authCardListScopeAbility.LIZLLL(enumC1070410dxfLIZ, zLJFF, C447550Hgn.LJ(C1262490ixT.LIZJ(authCardListScopeAbility.getConfig())));
                }
            } else {
                AuthCardListScopeAbility authCardListScopeAbility2 = (AuthCardListScopeAbility) agS204S0200000_16.l0;
                authCardListScopeAbility2.getClass();
                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on ");
                sbLIZ.append(enumC1070410dxfLIZ);
                sbLIZ.append(" checked, isGrant: ");
                sbLIZ.append(z2);
                sbLIZ.append(", willUpload: ");
                sbLIZ.append(true);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1264320j0Q.getClass();
                C1264320j0Q.LIZLLL("AuthAbility", strLIZIZ);
                authCardListScopeAbility2.LLJJ.remove(enumC1070410dxfLIZ);
                if (!z2) {
                    if (!Intrinsics.LJFF(((LinkedHashMap) authCardListScopeAbility2.LLJJI).get(enumC1070410dxfLIZ), Boolean.valueOf(z2))) {
                        authCardListScopeAbility2.LLILLL.LJJI();
                    }
                } else {
                    if (!(authCardListScopeAbility2.getConfig().listConfig.LJ instanceof C1260240itq) && !(authCardListScopeAbility2.getConfig().listConfig.LJ instanceof C1260220ito)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Iterator<InterfaceC1262230ix3> it2 = authCardListScopeAbility2.LLILLL.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC1262230ix3 next = it2.next();
                        if ((next instanceof C1261770iwJ) && ((C1261770iwJ) next).LL == enumC1070410dxfLIZ) {
                            if (i3 != -1) {
                                authCardListScopeAbility2.LLJJ.put(enumC1070410dxfLIZ, Integer.valueOf(i3));
                                List<InterfaceC1262230ix3> listLIZ = C1263430iyz.LIZ(authCardListScopeAbility2.LLILLL);
                                if (!(listLIZ instanceof Collection) || !listLIZ.isEmpty()) {
                                    i = 0;
                                    for (InterfaceC1262230ix3 interfaceC1262230ix3 : listLIZ) {
                                        if ((interfaceC1262230ix3 instanceof C1261860iwS) || (interfaceC1262230ix3 instanceof C1261770iwJ) || ((interfaceC1262230ix3 instanceof AbstractC1262120iws) && !((AbstractC1262120iws) interfaceC1262230ix3).LLILLL)) {
                                            i++;
                                            if (i < 0) {
                                                C1697810uHb.LJIJ();
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                if (!z || i != 1) {
                                    authCardListScopeAbility2.LLILLL.remove(i3);
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                    authCardListScopeAbility2.getConfig();
                }
            }
            ((AuthCardListScopeAbility) agS204S0200000_16.l0).LLJJI.put(enumC1070410dxfLIZ, Boolean.valueOf(z2));
            return Unit.LIZ;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("AuthAbility", "platform not supported", e);
            return Unit.LIZ;
        }
    }

    public static final Object emit$14(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TextView) agS204S0200000_16.l0).setText(u.LJJIFFI(((C1006120cHy) agS204S0200000_16.l1).LL.getContext().getString(2131837752), "{sound_name}", (String) obj, false));
        return Unit.LIZ;
    }

    public static final Object emit$15(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((TextView) agS204S0200000_16.l0).setText(u.LJJIFFI(((ViewStub) agS204S0200000_16.l1).getContext().getString(2131827236), "{sound_name}", (String) obj, false));
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1048750dOj c1048750dOj;
        Context context;
        if (((Boolean) obj).booleanValue() && (context = (c1048750dOj = (C1048750dOj) agS204S0200000_16.l0).LLILZLL) != null) {
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = (AdFollowUpAceSurveyVM) agS204S0200000_16.l1;
            C1048780dOm c1048780dOm = (C1048780dOm) c1048750dOj.LLJJJIL.getValue();
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("ace_submit_page_url", "https://inapp.tiktokv.com/ad/tetris/experience/feedback_rate?hide_nav_bar=1");
            Aweme aweme = c1048750dOj.LLIZ;
            C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
            c1048780dOm.LIZIZ(strLJI, context, C1048600dOU.LIZ(C1048570dOR.LIZ().LIZ(C1048600dOU.LIZJ(c1048750dOj.LLIZ)), aweme, "followup2"), new AwS560S0100000_16(adFollowUpAceSurveyVM, 56));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS204S0200000_16 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS204S0200000_16.emit$3(Y.AgS204S0200000_16, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$4(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribe State : ");
        sbLIZ.append(((EnumC1011130cQ3) agS204S0200000_16.l0).name());
        sbLIZ.append(" it=");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        ((Function0) agS204S0200000_16.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS204S0200000_16 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1011650cQt
            if (r0 == 0) goto L3b
            r4 = r7
            X.0cQt r4 = (X.C1011650cQt) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            X.0cQ3 r0 = (X.EnumC1011130cQ3) r0
            if (r6 != r0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3b:
            X.0cQt r4 = new X.0cQt
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS204S0200000_16.emit$5(Y.AgS204S0200000_16, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$6(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        int i = C1070760dyE.LIZ[c1071240dz0.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c1071240dz0.LIZ.LIZJ) {
                        ((SocialRecRequestViewModel) agS204S0200000_16.l0).setState(AFwS252S0000000_16.get$arr$(414));
                        SocialRecRequestViewModel socialRecRequestViewModel = (SocialRecRequestViewModel) agS204S0200000_16.l0;
                        socialRecRequestViewModel.setState(new AwS382S0200000_16((EnumC1070340dxY) agS204S0200000_16.l1, socialRecRequestViewModel, 57));
                    } else {
                        ((SocialRecRequestViewModel) agS204S0200000_16.l0).setState(AFwS252S0000000_16.get$arr$(415));
                    }
                }
            } else if (c1071240dz0.LIZ.LIZJ) {
                SocialRecRequestViewModel socialRecRequestViewModel2 = (SocialRecRequestViewModel) agS204S0200000_16.l0;
                socialRecRequestViewModel2.setState(new AwS382S0200000_16((EnumC1070340dxY) agS204S0200000_16.l1, socialRecRequestViewModel2, 56));
                ((SocialRecRequestViewModel) agS204S0200000_16.l0).LLILZIL = true;
            } else {
                ((SocialRecRequestViewModel) agS204S0200000_16.l0).setState(AFwS252S0000000_16.get$arr$(413));
            }
        } else if (!c1071240dz0.LIZ.LIZJ) {
            ((SocialRecRequestViewModel) agS204S0200000_16.l0).setState(AFwS252S0000000_16.get$arr$(412));
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070290dxT.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("mlbb", false);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS204S0200000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070310dxV.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            C1071260dz2 c1071260dz2 = c1071240dz0.LIZ;
            if (c1071260dz2.LIZ) {
                if (c1071260dz2.LIZJ) {
                    C1070540dxs c1070540dxs = new C1070540dxs("mlbb", true);
                    FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                    if (findCtxViewModel != null) {
                        findCtxViewModel.vQ2(c1070540dxs);
                    }
                } else if (!c1071260dz2.LIZJ) {
                    C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                    Context context = (Context) agS204S0200000_16.l0;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                    c1070520dxq.getClass();
                    C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                    if (c1389890mGxLJFF != null) {
                        c1389890mGxLJFF.LJIIIZ(2131834214);
                        c1389890mGxLJFF.LJIIJJI();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS204S0200000_16 agS204S0200000_16, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1071240dz0 c1071240dz0 = (C1071240dz0) obj;
        if (C1070110dxB.LIZ[c1071240dz0.LIZIZ.ordinal()] == 1) {
            if (c1071240dz0.LIZ.LIZJ) {
                C1070540dxs c1070540dxs = new C1070540dxs("mlbb", false);
                FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
                if (findCtxViewModel != null) {
                    findCtxViewModel.vQ2(c1070540dxs);
                }
            } else {
                C1070520dxq c1070520dxq = C1070520dxq.LIZ;
                Context context = (Context) agS204S0200000_16.l0;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) agS204S0200000_16.l1;
                c1070520dxq.getClass();
                C1389890mGx c1389890mGxLJFF = C1070520dxq.LJFF(context, lifecycleOwner);
                if (c1389890mGxLJFF != null) {
                    c1389890mGxLJFF.LJIIIZ(2131834214);
                    c1389890mGxLJFF.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }
}
