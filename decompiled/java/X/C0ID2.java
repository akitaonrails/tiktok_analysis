package X;

import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.commentpost.CommentPostDemoDialog;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.ShareEffectReusedUISlot;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ID2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID2 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Bh$0(C0ID2 c0id2, Uri uri, View view) {
    }

    public static final void cm$0(C0ID2 c0id2, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C0ID2 c0id2, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            case 4:
                Ad$4(this, uri, view, c428600GrK, animatable);
                break;
            case 5:
                Ad$5(this, uri, view, c428600GrK, animatable);
                break;
            case 6:
                Ad$6(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        if (4 - this.$t != 0) {
            super.Bh(uri, view);
        } else {
            Bh$0(this, uri, view);
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            case 4:
                cm$4(this, uri, view, th);
                break;
            case 5:
                cm$5(this, uri, view, th);
                break;
            case 6:
                cm$6(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C0ID2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$1(C0ID2 c0id2, Uri uri, View view, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image loading failed, message=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void cm$3(C0ID2 c0id2, Uri uri, View view, Throwable th) {
        C786410Ut5.LJLLLLLL(0, (View) c0id2.l0);
    }

    public static final void cm$4(C0ID2 c0id2, Uri uri, View view, Throwable th) {
        C786410Ut5.LLFF(0, (SmartImageView) ((ShareEffectReusedUISlot) c0id2.l0).LLJLIL.getValue());
    }

    public static final void cm$5(C0ID2 c0id2, Uri uri, View view, Throwable th) {
        CommentPostDemoDialog commentPostDemoDialog = (CommentPostDemoDialog) c0id2.l0;
        View viewFindViewById = commentPostDemoDialog.LLJILJIL;
        if (viewFindViewById == null) {
            View view2 = commentPostDemoDialog.getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.w28);
            } else {
                viewFindViewById = null;
            }
            commentPostDemoDialog.LLJILJIL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.LJZ(8, (FrameLayout) viewFindViewById);
        ((CommentPostDemoDialog) c0id2.l0).NR().LIZLLL();
        CommentPostDemoDialog commentPostDemoDialog2 = (CommentPostDemoDialog) c0id2.l0;
        View viewFindViewById2 = commentPostDemoDialog2.LLJILJILJ;
        if (viewFindViewById2 == null) {
            View view3 = commentPostDemoDialog2.getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.hc6);
            } else {
                viewFindViewById2 = null;
            }
            commentPostDemoDialog2.LLJILJILJ = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.LLLLLLZZ((TuxIconView) viewFindViewById2, 0);
        Long l = (Long) ((CommentPostDemoDialog) c0id2.l0).LLJJIJIIJIL.getValue();
        if (l != null && l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LJ(Boolean.FALSE, "is_success");
            C1350920lG6.LJJJ(c2344009Gk, "comment_post_intro_duration");
        }
    }

    public static final void cm$6(C0ID2 c0id2, Uri uri, View view, Throwable th) {
        ((C426060GnE) c0id2.l0).LLJLLL = true;
    }

    public static final void Ad$0(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        int i;
        int iLIZIZ;
        Number numberValueOf;
        int i2 = 90;
        if (c428600GrK != null) {
            i2 = c428600GrK.LIZIZ;
        }
        if (c428600GrK != null) {
            i = c428600GrK.LIZ;
        } else {
            i = 64;
        }
        float f = i2 / i;
        double d = f;
        if (d > 1.7d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        } else if (d >= 1.4d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        } else if (d >= 1.2d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        float f2 = iLIZIZ * f;
        if (f2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
            numberValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
        } else {
            numberValueOf = Float.valueOf(f2);
        }
        ViewGroup.LayoutParams layoutParams = ((BookSearchItemCell) c0id2.l0).itemView.findViewById(R.id.cover).getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = numberValueOf.intValue();
        C786410Ut5.G6((SmartImageView) ((BookSearchItemCell) c0id2.l0).itemView.findViewById(R.id.cover), layoutParams);
    }

    public static final void Ad$1(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (c428600GrK == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((SmartImageView) c0id2.l0).getLayoutParams();
        int i = ScreenshotShareFragment.LLJJIJI;
        layoutParams.width = C814420VxA.LIZIZ(i * (c428600GrK.LIZ / c428600GrK.LIZIZ));
        layoutParams.height = i;
        ((SmartImageView) c0id2.l0).requestLayout();
    }

    public static final void Ad$2(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (c428600GrK == null) {
            return;
        }
        int i = c428600GrK.LIZ;
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) * i) / c428600GrK.LIZIZ;
        ViewGroup.LayoutParams layoutParams = ((SmartImageView) c0id2.l0).getLayoutParams();
        layoutParams.width = iLIZIZ;
        C786410Ut5.G6((SmartImageView) c0id2.l0, layoutParams);
        if (C426750GoL.LIZLLL(((SmartImageView) c0id2.l0).getContext())) {
            C786410Ut5.fc((SmartImageView) c0id2.l0, -1.0f);
        }
    }

    public static final void Ad$3(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C786410Ut5.LJLLLLLL(8, (View) c0id2.l0);
    }

    public static final void Ad$4(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C786410Ut5.u5((SmartImageView) ((ShareEffectReusedUISlot) c0id2.l0).LLJLIL.getValue(), 1.0f);
    }

    public static final void Ad$5(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        CommentPostDemoDialog commentPostDemoDialog = (CommentPostDemoDialog) c0id2.l0;
        View viewFindViewById = commentPostDemoDialog.LLJILJIL;
        if (viewFindViewById == null) {
            View view2 = commentPostDemoDialog.getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.w28);
            } else {
                viewFindViewById = null;
            }
            commentPostDemoDialog.LLJILJIL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.LJZ(8, (FrameLayout) viewFindViewById);
        CommentPostDemoDialog commentPostDemoDialog2 = (CommentPostDemoDialog) c0id2.l0;
        View viewFindViewById2 = commentPostDemoDialog2.LLJILJILJ;
        if (viewFindViewById2 == null) {
            View view3 = commentPostDemoDialog2.getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.hc6);
            } else {
                viewFindViewById2 = null;
            }
            commentPostDemoDialog2.LLJILJILJ = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.LLLLLLZZ((TuxIconView) viewFindViewById2, 8);
        ((CommentPostDemoDialog) c0id2.l0).NR().LIZLLL();
        CommentPostDemoDialog commentPostDemoDialog3 = (CommentPostDemoDialog) c0id2.l0;
        View viewFindViewById3 = commentPostDemoDialog3.LLJILLL;
        if (viewFindViewById3 == null) {
            View view4 = commentPostDemoDialog3.getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.rj3);
            } else {
                viewFindViewById3 = null;
            }
            commentPostDemoDialog3.LLJILLL = (C197039127h) viewFindViewById3;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById3, new ACListenerS141S0100000_6((CommentPostDemoDialog) c0id2.l0, 122));
        Long l = (Long) ((CommentPostDemoDialog) c0id2.l0).LLJJIJIIJIL.getValue();
        if (l != null && l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LJ(Boolean.TRUE, "is_success");
            C1350920lG6.LJJJ(c2344009Gk, "comment_post_intro_duration");
        }
    }

    public static final void Ad$6(C0ID2 c0id2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((C426060GnE) c0id2.l0).LLJLLL = true;
    }
}
