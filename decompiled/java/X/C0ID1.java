package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceCell;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ID1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID1 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C0ID1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void cm$0(C0ID1 c0id1, Uri uri, View view, Throwable th) {
        Function0 function0 = (Function0) c0id1.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void cm$1(C0ID1 c0id1, Uri uri, View view, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri :");
        sbLIZ.append(uri);
        sbLIZ.append("  throwable: ");
        sbLIZ.append(th);
        C1330590kjJ.LIZLLL(((C1331510kkn) c0id1.l0).hashCode(), "SmartCircleImageView", "onFailed", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void cm$2(C0ID1 c0id1, Uri uri, View view, Throwable th) {
        String message;
        if (((C869590Y9l) c0id1.l0) == null) {
            return;
        }
        C0I0Y.LIZ(((ShareLiveCardAssem) c0id1.l1).tp());
        ShareLiveCardAssem shareLiveCardAssem = (ShareLiveCardAssem) c0id1.l1;
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        shareLiveCardAssem.LLLI.LIZ("live_card_protocol", new C0ZYR(message));
        ((ShareLiveCardAssem) c0id1.l1).sp(false);
    }

    public static final void cm$3(C0ID1 c0id1, Uri uri, View view, Throwable th) {
        SourceCell sourceCell = (SourceCell) c0id1.l0;
        Context contextI5 = sourceCell.I5();
        if (contextI5 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_video_slash_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            ((TuxIconView) sourceCell.itemView.findViewById(R.id.vr0)).setImageDrawable(c419910GdJ.LIZ(contextI5));
            C786410Ut5.LLLLLLZZ((TuxIconView) sourceCell.itemView.findViewById(R.id.vr0), 0);
        }
    }

    public static final void Ad$0(C0ID1 c0id1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function1 function1 = (Function1) c0id1.l0;
        if (function1 != null) {
            function1.invoke(c428600GrK);
        }
    }

    public static final void Ad$1(C0ID1 c0id1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((C427870Gq9) c0id1.l1).LLJILJIL = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri :");
        sbLIZ.append(uri);
        C1330590kjJ.LIZ(((C1331510kkn) c0id1.l0).hashCode(), "SmartCircleImageView", "onComplete", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void Ad$2(C0ID1 c0id1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (((C869590Y9l) c0id1.l0) == null) {
            return;
        }
        C0I0Y.LIZLLL(((ShareLiveCardAssem) c0id1.l1).tp());
        ShareLiveCardAssem shareLiveCardAssem = (ShareLiveCardAssem) c0id1.l1;
        shareLiveCardAssem.LLLI.LIZ("live_card_protocol", C0ICO.LIZ);
        ((ShareLiveCardAssem) c0id1.l1).sp(true);
    }

    public static final void Ad$3(C0ID1 c0id1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SourceCell sourceCell = (SourceCell) c0id1.l0;
        C1781740wSy c1781740wSy = (C1781740wSy) c0id1.l1;
        sourceCell.getClass();
        if (Intrinsics.LJFF(c1781740wSy.LLIZ, "comment")) {
            C786410Ut5.LLLLLLZZ((TuxIconView) sourceCell.itemView.findViewById(R.id.vr0), 8);
            return;
        }
        Context contextI5 = sourceCell.I5();
        if (contextI5 == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        ((TuxIconView) sourceCell.itemView.findViewById(R.id.vr0)).setImageDrawable(c419910GdJ.LIZ(contextI5));
        C786410Ut5.LLLLLLZZ((TuxIconView) sourceCell.itemView.findViewById(R.id.vr0), 0);
    }
}
