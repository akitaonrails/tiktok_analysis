package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

/* JADX INFO: renamed from: X.0Gl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424700Gl2 extends RemoteImageView {
    public C1323050kX9<Bitmap> LLILLJJLI;
    public UrlModel LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final C0IE7 LLIZ;

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public void LIZJ() {
    }

    public String getUrl() {
        UrlModel urlModel = this.LLILLL;
        return (urlModel == null || urlModel.getUrlList() == null || this.LLILLL.getUrlList().size() == 0) ? "" : (String) ListProtector.get(this.LLILLL.getUrlList(), 0);
    }

    public InterfaceC1320650kTH<InterfaceC1330440kj4> getControllerListener() {
        return this.LLIZ;
    }

    public C424700Gl2(Context context) {
        super(context);
        this.LLIZ = new C0IE7(this, 0);
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setAttached(boolean z) {
        this.LLILZ = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.LLILZLL = z;
    }

    public C424700Gl2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = new C0IE7(this, 0);
        LIZJ();
    }

    public C424700Gl2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = new C0IE7(this, 0);
        LIZJ();
    }
}
