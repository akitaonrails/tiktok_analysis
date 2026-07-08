package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115570f8V {
    public float LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LJ;
    public View LJI;
    public float LJIIIIZZ;
    public C1115620f8a LJIIIZ;
    public boolean LIZLLL = true;
    public int LJFF = -1;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public int LJIIJ = 5;

    public final void LIZ(float f, View view, int i, EmoteModel emoteModel) {
        int i2;
        boolean z;
        View view2;
        User user = null;
        if (this.LJFF != i && System.currentTimeMillis() - this.LJ > 500 && Math.abs(f - this.LIZ) < 20.0f) {
            this.LIZLLL = false;
            this.LJII.removeCallbacksAndMessages(null);
        }
        int i3 = this.LJFF;
        if (i3 >= 0 && i != i3 && (view2 = this.LJI) != null) {
            view2.setBackground(new ColorDrawable(0));
        }
        if (!this.LIZLLL) {
            View viewFindViewById = view.findViewById(R.id.lfr);
            if (emoteModel.image != null) {
                Context context = view.getContext();
                if (this.LJFF != i && viewFindViewById != null) {
                    this.LJFF = i;
                    this.LJI = viewFindViewById;
                    float f2 = 126;
                    int iLIZIZ = (int) C497740JfY.LIZIZ(f2);
                    int i4 = i % this.LJIIJ;
                    View viewSd = C786410Ut5.Sd(R.layout.gz4, C786410Ut5.ne(context), null);
                    ImageView imageView = (ImageView) viewSd.findViewById(R.id.lyj);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                    if (i4 == 0) {
                        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(25.0f));
                    } else if (i4 == this.LJIIJ - 1) {
                        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(67.0f));
                    } else {
                        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(46.0f));
                    }
                    C786410Ut5.c6(imageView, marginLayoutParams);
                    C1115620f8a c1115620f8a = this.LJIIIZ;
                    if (c1115620f8a != null && c1115620f8a.isShowing()) {
                        this.LJIIIZ.dismiss();
                    } else {
                        this.LJIIIZ = new C1115620f8a();
                    }
                    C1115620f8a c1115620f8a2 = this.LJIIIZ;
                    if (c1115620f8a2 != null) {
                        C497740JfY.LIZIZ(f2);
                        int iLIZIZ2 = (int) C497740JfY.LIZIZ(130);
                        c1115620f8a2.LL = viewSd;
                        c1115620f8a2.setContentView(viewSd);
                        c1115620f8a2.setWidth(-2);
                        c1115620f8a2.setHeight(-2);
                        c1115620f8a2.setOutsideTouchable(true);
                        c1115620f8a2.LLILLJJLI = iLIZIZ2;
                    }
                    if (i4 == this.LJIIJ - 1) {
                        i2 = -(iLIZIZ - viewFindViewById.getWidth());
                    } else {
                        i2 = (-(iLIZIZ - viewFindViewById.getWidth())) / 2;
                    }
                    EmoteUploadInfo emoteUploadInfo = emoteModel.emoteUploadInfo;
                    if (emoteUploadInfo != null) {
                        User user2 = emoteUploadInfo.userInfo;
                        if (user2 != null && user2.getSecret() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.bcc);
                            C1324720kZq c1324720kZq = (C1324720kZq) viewSd.findViewById(R.id.lfs);
                            C786410Ut5.LLJJJJ(c16f5, 0);
                            C786410Ut5.LLJJIII(c1324720kZq, 0);
                            c16f5.setText(C497740JfY.LJIJI(2131852081));
                        } else {
                            EmoteUploadInfo emoteUploadInfo2 = emoteModel.emoteUploadInfo;
                            if (emoteUploadInfo2 != null) {
                                user = emoteUploadInfo2.userInfo;
                            }
                            String strLIZ = C0KVU.LIZ(user);
                            if (strLIZ.length() > 0) {
                                C16F5 c16f52 = (C16F5) viewSd.findViewById(R.id.bcc);
                                C1324720kZq c1324720kZq2 = (C1324720kZq) viewSd.findViewById(R.id.lfs);
                                C786410Ut5.LLJJJJ(c16f52, 0);
                                C786410Ut5.LLJJIII(c1324720kZq2, 0);
                                c16f52.setText(C497740JfY.LJIJJ(2131852082, strLIZ));
                            }
                        }
                    }
                    ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.ll7);
                    if (emoteModel.image != null) {
                        C1115620f8a c1115620f8a3 = this.LJIIIZ;
                        c1115620f8a3.dismiss();
                        int[] iArr = new int[2];
                        viewFindViewById.getLocationInWindow(iArr);
                        c1115620f8a3.showAtLocation(viewFindViewById, 0, iArr[0] + i2, iArr[1] - c1115620f8a3.LLILLJJLI);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJI(c1115620f8a3);
                        C787990Uvd.LIZ.getClass();
                        C994003uc.LIZ();
                        C0JSS.LJ(imageView2, emoteModel.image, 0);
                        this.LJIIIZ.update((int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(130));
                    }
                }
            }
        }
    }
}
