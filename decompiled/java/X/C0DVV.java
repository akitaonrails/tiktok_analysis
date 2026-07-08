package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DVV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVV implements IPublishOptionCustomViewFactory {
    public static final C0DVV LIZ = new C0DVV();

    @Override // com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory
    public final void expandRightPartHitRect(View view, ViewGroup viewGroup) {
        Rect rect;
        ViewGroup viewGroup2;
        View viewFindViewById = view.findViewById(R.id.tlf);
        if (viewFindViewById == null) {
            return;
        }
        if (C444960Hcc.LIZJ(view.getContext())) {
            rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        } else {
            rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        if (viewGroup != null) {
            C19713912Bd.LIZ.getClass();
            C19713912Bd.LIZ(rect, viewFindViewById, viewGroup);
            return;
        }
        C19713912Bd c19713912Bd = C19713912Bd.LIZ;
        ViewParent parent = viewFindViewById.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = null;
        }
        c19713912Bd.getClass();
        C19713912Bd.LIZ(rect, viewFindViewById, viewGroup2);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory
    public final View createCustomView(Context context, String str, View view, UrlModel urlModel, int i, boolean z, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        String str2;
        View viewSd = C786410Ut5.Sd(R.layout.d71, C786410Ut5.ne(context), null);
        ((TextView) viewSd.findViewById(R.id.tv_title)).setText(str);
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.i6y);
        if (view != null) {
            viewGroup.addView(view);
        }
        if (urlModel != null) {
            SmartImageView smartImageView = new SmartImageView(context);
            C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
            viewGroup.addView(smartImageView);
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str2 = (String) C13LP.LJJJJZI(urlList)) == null) {
                str2 = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (i > 1) {
            C786410Ut5.LJZL(0, (LinearLayout) viewSd.findViewById(R.id.tk_));
            ((TextView) viewSd.findViewById(R.id.zfl)).setText(String.valueOf(i));
            C786410Ut5.LJLLLLLL(0, viewSd.findViewById(R.id.uqh));
            C786410Ut5.K7((ViewGroup) viewSd.findViewById(R.id.tlf), new ACListenerS139S0100000_4(function1, 106));
        }
        if (z) {
            C786410Ut5.LLLLLLZZ((TuxIconView) viewSd.findViewById(R.id.tkw), 0);
            C786410Ut5.LJLLLLLL(0, viewSd.findViewById(R.id.uqh));
            C786410Ut5.K7((ViewGroup) viewSd.findViewById(R.id.tlf), new ACListenerS139S0100000_4(function12, 107));
        }
        C786410Ut5.x3(viewSd.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC346410Di3(viewSd, 2));
        return viewSd;
    }
}
