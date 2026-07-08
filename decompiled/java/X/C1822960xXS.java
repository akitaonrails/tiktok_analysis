package X;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0xXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822960xXS {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC1823000xXW LIZ(ViewGroup viewGroup, final boolean z, final String str, final String str2, final InterfaceC1823190xXp interfaceC1823190xXp, final boolean z2, final int i, final C1822330xWR c1822330xWR) {
        if (c1822330xWR != null && c1822330xWR.LIZ()) {
            final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gu0, viewGroup, false);
            return new C1822980xXU(viewLJIILL, z, str, str2, interfaceC1823190xXp, z2, c1822330xWR) { // from class: X.0xXT
                public final View LLJJJ;

                @Override // X.C1822980xXU
                public final void P5(boolean z3, C1822350xWT c1822350xWT) {
                    super.P5(z3, c1822350xWT);
                    if (C500260Jjc.LJJJJIZL(this.LLJJIJIL) && C500260Jjc.LJJJJIZL(this.LLJILLL) && C500260Jjc.LJJJJIZL(this.LLJJI)) {
                        C500260Jjc.LLFFF(this.LLJJJ);
                    }
                }

                {
                    super(viewLJIILL, z, str, str2, interfaceC1823190xXp, z2, c1822330xWR);
                    this.LLJJJ = viewLJIILL.findViewById(R.id.moq);
                }
            };
        }
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
            final View viewLJIILL2 = C500260Jjc.LJIILL(R.layout.gtz, viewGroup, false);
            return new AbstractC1823000xXW(viewLJIILL2, z, str, str2, interfaceC1823190xXp, z2, i, c1822330xWR) { // from class: X.0xXV
                public final LiveIconView LLJILLL;
                public final LiveIconView LLJJ;
                public final View LLJJI;

                @Override // X.AbstractC1823000xXW
                public final void I5(final C1822350xWT c1822350xWT) {
                    LiveIconView liveIconView;
                    LiveIconView liveIconView2;
                    LiveIconView liveIconView3;
                    super.I5(c1822350xWT);
                    if (c1822350xWT == null) {
                        return;
                    }
                    int iIntValue = 0;
                    if (c1822350xWT.LIZLLL.length() == 0) {
                        LiveIconView liveIconView4 = this.LLJILLL;
                        if (liveIconView4 != null) {
                            C500260Jjc.LJIILIIL(liveIconView4);
                        }
                    } else {
                        LiveIconView liveIconView5 = this.LLJILLL;
                        if (liveIconView5 != null) {
                            C500260Jjc.LLFFF(liveIconView5);
                        }
                        if (!this.LL && (liveIconView = this.LLJILLL) != null) {
                            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXY
                                @Override // X.AbstractViewOnClickListenerC1637610siV
                                public final void LIZ(View view) {
                                    FragmentManager supportFragmentManager;
                                    if (view != null) {
                                        final C1822990xXV c1822990xXV = this.LLILZ;
                                        String str3 = c1822350xWT.LIZLLL;
                                        c1822990xXV.LLILLL.LJ("phone");
                                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1822990xXV.itemView.getContext());
                                        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                                            C1390850mIV c1390850mIV = new C1390850mIV();
                                            c1390850mIV.LIZ.LLJJIJI = C497740JfY.LJIJI(2131855965);
                                            C1247510iZJ c1247510iZJ = new C1247510iZJ();
                                            c1247510iZJ.LIZ = str3;
                                            c1247510iZJ.LIZ(new C1823040xXa(c1822990xXV, str3));
                                            c1390850mIV.LJI(Collections.singletonList(c1247510iZJ));
                                            c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0xXj
                                                @Override // android.content.DialogInterface.OnCancelListener
                                                public final void onCancel(DialogInterface dialogInterface) {
                                                    c1822990xXV.LLILLL.LIZLLL("cancel");
                                                }
                                            };
                                            c1390850mIV.LIZJ().show(supportFragmentManager, "phone");
                                        }
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(300L);
                                }
                            }, liveIconView);
                        }
                    }
                    if (c1822350xWT.LIZJ.length() == 0) {
                        LiveIconView liveIconView6 = this.LLJJ;
                        if (liveIconView6 != null) {
                            C500260Jjc.LJIILIIL(liveIconView6);
                        }
                    } else {
                        LiveIconView liveIconView7 = this.LLJJ;
                        if (liveIconView7 != null) {
                            C500260Jjc.LLFFF(liveIconView7);
                        }
                        if (!this.LL && (liveIconView2 = this.LLJJ) != null) {
                            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXm
                                @Override // X.AbstractViewOnClickListenerC1637610siV
                                public final void LIZ(View view) throws JSONException {
                                    if (view != null) {
                                        L5(view, c1822350xWT.LIZJ);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(300L);
                                }
                            }, liveIconView2);
                        }
                    }
                    LiveIconView liveIconView8 = this.LLJILLL;
                    if (liveIconView8 != null && liveIconView8.getVisibility() == 0 && (liveIconView3 = this.LLJJ) != null && liveIconView3.getVisibility() == 0) {
                        View view = this.LLJJI;
                        if (view != null) {
                            C500260Jjc.LLFFF(view);
                        }
                    } else {
                        View view2 = this.LLJJI;
                        if (view2 != null) {
                            C500260Jjc.LJIILIIL(view2);
                        }
                    }
                    if (!this.LLILZ) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ez3, this.itemView.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        LiveIconView liveIconView9 = this.LLJILLL;
                        if (liveIconView9 != null) {
                            liveIconView9.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
                        }
                        LiveIconView liveIconView10 = this.LLJJ;
                        if (liveIconView10 != null) {
                            liveIconView10.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
                        }
                    }
                    N5();
                }

                {
                    super(viewLJIILL2, z, str, str2, interfaceC1823190xXp, z2, i, c1822330xWR);
                    this.LLJILLL = (LiveIconView) viewLJIILL2.findViewById(R.id.qb0);
                    this.LLJJ = (LiveIconView) viewLJIILL2.findViewById(R.id.gyu);
                    viewLJIILL2.findViewById(R.id.eqm);
                    this.LLJJI = viewLJIILL2.findViewById(R.id.eqt);
                    viewLJIILL2.findViewById(R.id.y0w);
                }
            };
        }
        return new C1822980xXU(C500260Jjc.LJIILL(R.layout.gty, viewGroup, false), z, str, str2, interfaceC1823190xXp, z2, c1822330xWR);
    }
}
