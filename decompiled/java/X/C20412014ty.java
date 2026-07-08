package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412014ty extends AbstractC960470b6L<C1868360yig> {
    public final InterfaceC20412914u7 LL;
    public final DataChannel LLILLJJLI;
    public final TextView LLILLL;
    public final View LLILZ;
    public final TextView LLILZIL;
    public final C1324720kZq LLILZLL;
    public final C376990EqH LLIZ;
    public final C376770Epv LLIZLLLIL;
    public final View LLJ;
    public final boolean LLJI;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        String str;
        Boolean bool;
        int iLIZIZ;
        float fLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZJ;
        boolean z;
        C1868360yig c1868360yig = (C1868360yig) obj;
        final Playbook playbook = c1868360yig.LIZ;
        TextView textView = this.LLILLL;
        PlaybookContent playbookContent = playbook.content;
        String str2 = null;
        if (playbookContent != null) {
            str = playbookContent.title;
        } else {
            str = null;
        }
        textView.setText(str);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserHasLivePermission.class);
        } else {
            bool = null;
        }
        if (bool != null) {
            C500260Jjc.LJLJLJ(this.LLILZIL, true);
            C500260Jjc.LJLJLJ(this.LLILZ, true);
            Playbook playbook2 = c1868360yig.LIZ;
            boolean zBooleanValue = bool.booleanValue();
            PlaybookContent playbookContent2 = playbook2.content;
            if (playbookContent2 != null && (playbookContent2.contentStatus == 3 || playbookContent2.contentStatus == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLJI && z && zBooleanValue) {
                if (this.LL.LLJJ() == playbook2.playbookId) {
                    this.LLILZIL.setText(C497740JfY.LJIJI(2131854124));
                    C500260Jjc.LJLIIIL(500L, this.LLILZ, new C20412714u5(this, playbook2));
                } else {
                    this.LLILZIL.setText(C497740JfY.LJIJI(2131854079));
                    C500260Jjc.LJLIIIL(500L, this.LLILZ, new C20412514u3(this, playbook2));
                }
            } else {
                this.LLILZIL.setText(C497740JfY.LJIJI(2131854124));
                C500260Jjc.LJLIIIL(500L, this.LLILZ, new C20412614u4(this, playbook2));
            }
        } else {
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            C500260Jjc.LJLJLJ(this.LLILZ, false);
        }
        PlaybookContent playbookContent3 = playbook.content;
        if (playbookContent3 != null) {
            str2 = playbookContent3.coverUrl;
        }
        C376990EqH c376990EqH = this.LLIZ;
        if (c376990EqH != null) {
            C439101nJ.LJI(c376990EqH);
        }
        Context context = this.itemView.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, context)) != null) {
            this.LLIZLLLIL.setTargetColor(numLIZJ.intValue());
        }
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str2);
        url.LJIIIZ = R.drawable.f3f;
        url.LJIILL = new float[]{(int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f)};
        url.LJIIL = new InterfaceC1142670fqD() { // from class: X.14u0
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str3, Exception exc) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str3) {
                final C20412014ty c20412014ty = this.LIZ;
                C1324720kZq c1324720kZq = c20412014ty.LLILZLL;
                if (c1324720kZq != null) {
                    HandlerHook.viewPost(c1324720kZq, new Runnable() { // from class: X.14tx
                        public final void LIZ() {
                            if (c20412014ty.LLILZLL.getParent() == null) {
                                return;
                            }
                            C20394714rB c20394714rB = C20394714rB.LIZ;
                            C1324720kZq c1324720kZq2 = c20412014ty.LLILZLL;
                            c20394714rB.getClass();
                            Bitmap bitmapLIZ = C20394714rB.LIZ(c1324720kZq2);
                            if (bitmapLIZ == null) {
                                return;
                            }
                            try {
                                int iLIZIZ2 = C20394714rB.LIZIZ(bitmapLIZ);
                                c20412014ty.LLIZLLLIL.setTargetColor(iLIZIZ2);
                                if (!C011Z.LIZ.LJIJ(c20412014ty.itemView.getContext())) {
                                    c20412014ty.LLIZ.setColor(iLIZIZ2);
                                    C376990EqH c376990EqH2 = c20412014ty.LLIZ;
                                    if (c376990EqH2 != null) {
                                        C12ES.LJIILL(0, c376990EqH2);
                                    }
                                }
                                C20394714rB.LJI(bitmapLIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C20394714rB.LIZ.getClass();
                                C20394714rB.LJI(bitmapLIZ);
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PlaybookFavoritesItemViewHolder@2898.loadBg$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PlaybookFavoritesItemViewHolder@2898.loadBg$1");
                        }
                    });
                }
            }
        };
        url.LJJI(this.LLILZLL);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14u6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LL.LIZ(playbook, true);
            }
        }, this.itemView);
        if (this.LL.LIZJ() == playbook.playbookId) {
            View view = this.LLJ;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else {
            View view2 = this.LLJ;
            if (view2 != null) {
                C439101nJ.LJI(view2);
            }
        }
        C497740JfY.LIZ(4.0f);
        C497740JfY.LIZ(4.0f);
        if (i == 0) {
            iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            fLIZIZ = C497740JfY.LIZIZ(4.0f);
        } else {
            AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
            if (bindingAdapter != null && i == bindingAdapter.getItemCount() - 1) {
                iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                fLIZIZ = C497740JfY.LIZIZ(16.0f);
            } else {
                iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                fLIZIZ = C497740JfY.LIZIZ(4.0f);
            }
        }
        int i2 = (int) fLIZIZ;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(iLIZIZ);
            marginLayoutParams.setMarginEnd(i2);
            C786410Ut5.W5(this.itemView, marginLayoutParams);
        }
    }

    public C20412014ty(View view, InterfaceC20412914u7 interfaceC20412914u7, DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool;
        super(view);
        this.LL = interfaceC20412914u7;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = (TextView) view.findViewById(R.id.qrf);
        this.LLILZ = view.findViewById(R.id.qrg);
        this.LLILZIL = (TextView) view.findViewById(R.id.qrh);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.qrc);
        this.LLIZ = (C376990EqH) view.findViewById(R.id.qrb);
        this.LLIZLLLIL = (C376770Epv) view.findViewById(R.id.qre);
        this.LLJ = view.findViewById(R.id.qrd);
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C956690b0F.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLJI = zBooleanValue;
    }
}
