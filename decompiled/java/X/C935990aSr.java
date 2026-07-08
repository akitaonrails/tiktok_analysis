package X;

import Y.ACListenerS24S0500000_15;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAvatarPreviewRefresh;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935990aSr {
    public static String LIZ = "";

    public static final String LIZJ() {
        String str = LIZ;
        return str.length() == 0 ? "apply_panel" : str;
    }

    public static final View LIZ(Avatar avatar, Context context, final DataChannel dataChannel) {
        InterfaceC494301wD interfaceC494301wDLIZIZ;
        C936170aT9 c936170aT9QA;
        boolean z;
        InterfaceC665370Q7z interfaceC665370Q7z;
        if (context == null) {
            return null;
        }
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7z, IAvatarBusinessAbility.class, null);
        } else {
            interfaceC494301wDLIZIZ = null;
        }
        IAvatarBusinessAbility iAvatarBusinessAbility = (IAvatarBusinessAbility) interfaceC494301wDLIZIZ;
        if (iAvatarBusinessAbility != null) {
            c936170aT9QA = iAvatarBusinessAbility.qA();
        } else {
            c936170aT9QA = null;
        }
        if (avatar.status == 1) {
            if (c936170aT9QA != null) {
                long j = avatar.avatarId;
                Long l = c936170aT9QA.LJFF;
                if (l != null && j == l.longValue() && iAvatarBusinessAbility != null) {
                    iAvatarBusinessAbility.LC2();
                }
            }
            return null;
        }
        View viewSd = C786410Ut5.Sd(R.layout.fzf, C786410Ut5.ne(context), null);
        viewSd.setBackground(null);
        View viewFindViewById = viewSd.findViewById(R.id.bki);
        if (viewFindViewById != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        View viewFindViewById2 = viewSd.findViewById(R.id.bho);
        if (viewFindViewById2 != null) {
            C12ES.LJIILL(0, viewFindViewById2);
            C1819620xS4.LIZ().LJIIIZ(avatar.image).LJJI(viewFindViewById2);
        }
        View viewFindViewById3 = viewSd.findViewById(R.id.bhp);
        if (viewFindViewById3 != null) {
            C12ES.LJIILL(0, viewFindViewById3);
        }
        final C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.bkk);
        final C20515815Po c20515815Po = (C20515815Po) viewSd.findViewById(R.id.bkj);
        final LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.bkh);
        final C16F5 c16f52 = (C16F5) viewSd.findViewById(R.id.bkl);
        if (c936170aT9QA != null) {
            Long l2 = c936170aT9QA.LJFF;
            long j2 = avatar.avatarId;
            if (l2 != null && l2.longValue() == j2) {
                TextView textView = (TextView) viewSd.findViewById(R.id.bkl);
                if (textView != null) {
                    C12ES.LJIILL(0, textView);
                    textView.setText(C497740JfY.LJIJI(2131852817));
                }
                C12ES.LJIILL(0, c16f5);
                if (c20515815Po != null) {
                    C12ES.LJIILL(0, c20515815Po);
                    c20515815Po.setProgress(0);
                    c20515815Po.setMaxProgress(100);
                    c20515815Po.setProgressColor(-1);
                    c20515815Po.setCircleWidth((int) C497740JfY.LIZIZ(3.0f));
                }
                final C936170aT9 c936170aT9 = c936170aT9QA;
                viewSd.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(dataChannel, c20515815Po, c16f5, liveIconView, c16f52, c936170aT9) { // from class: X.0aSt
                    public final C936000aSs LL;
                    public final /* synthetic */ C936170aT9 LLILLJJLI;

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        this.LLILLJJLI.LJIIJ.observeForever(this.LL);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        this.LLILLJJLI.LJIIJ.removeObserver(this.LL);
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aSs] */
                    {
                        this.LLILLJJLI = c936170aT9;
                        this.LL = new Observer() { // from class: X.0aSs
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj) {
                                Avatar avatar2;
                                C936030aSv c936030aSv = (C936030aSv) obj;
                                if (c936030aSv != null) {
                                    EnumC935940aSm enumC935940aSm = c936030aSv.LIZIZ;
                                    if (enumC935940aSm == EnumC935940aSm.STATE_SUCCESS) {
                                        DataChannel dataChannel2 = dataChannel;
                                        if (dataChannel2 != null) {
                                            dataChannel2.FQ2(MultiGuestAvatarPreviewRefresh.class);
                                            return;
                                        }
                                        return;
                                    }
                                    int i = C936020aSu.LIZ[enumC935940aSm.ordinal()];
                                    boolean z2 = true;
                                    if (i != 1) {
                                        if (i != 2) {
                                            return;
                                        }
                                        C20515815Po c20515815Po2 = c20515815Po;
                                        if (c20515815Po2 != null) {
                                            c20515815Po2.setProgress(c936030aSv.LIZJ);
                                        }
                                        C16F5 c16f53 = c16f5;
                                        if (c16f53 == null) {
                                            return;
                                        }
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(c936030aSv.LIZJ);
                                        sbLIZ.append('%');
                                        c16f53.setText(C2188811AlT.LIZIZ(sbLIZ));
                                        return;
                                    }
                                    C16F5 c16f54 = c16f5;
                                    C20515815Po c20515815Po3 = c20515815Po;
                                    LiveIconView liveIconView2 = liveIconView;
                                    C16F5 c16f55 = c16f52;
                                    C936170aT9 c936170aT92 = c936170aT9;
                                    boolean zLIZ = c936030aSv.LIZ.LIZ();
                                    C936030aSv value = c936030aSv.LIZ.LJIIJ.getValue();
                                    if (value == null || (avatar2 = value.LIZLLL) == null || avatar2.status != 3) {
                                        z2 = false;
                                    }
                                    C935990aSr.LIZIZ(c16f54, c20515815Po3, liveIconView2, c16f55, c936170aT92, zLIZ, z2);
                                }
                            }
                        };
                    }
                });
                return viewSd;
            }
        }
        if (avatar.status == 3) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(c16f5, c20515815Po, liveIconView, c16f52, c936170aT9QA, false, z);
        return viewSd;
    }

    public static final void LIZIZ(C16F5 c16f5, C20515815Po c20515815Po, LiveIconView liveIconView, C16F5 c16f52, C936170aT9 c936170aT9, boolean z, boolean z2) {
        String strLJIJI;
        int i;
        if (c16f5 != null) {
            C439101nJ.LJI(c16f5);
        }
        if (c20515815Po != null) {
            C439101nJ.LJI(c20515815Po);
        }
        if (liveIconView != null) {
            C12ES.LJIILL(0, liveIconView);
            Context context = liveIconView.getContext();
            if (z) {
                i = R.attr.cpl;
            } else {
                i = R.attr.dn7;
            }
            liveIconView.setIcon(C20736316Cj.LIZLLL(i, context));
            C786410Ut5.g8(liveIconView, new ACListenerS24S0500000_15(c936170aT9, c16f5, c20515815Po, liveIconView, c16f52, 1));
        }
        if (c16f52 != null) {
            C12ES.LJIILL(0, c16f52);
            if (!z && z2) {
                strLJIJI = C497740JfY.LJIJI(2131852820);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131852821);
            }
            c16f52.setText(strLJIJI);
        }
    }
}
