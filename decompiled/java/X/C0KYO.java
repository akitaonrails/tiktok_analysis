package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0KYO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYO implements InterfaceC177000m8 {
    public final /* synthetic */ WeakReference LIZ;
    public final /* synthetic */ float LIZIZ;
    public final /* synthetic */ Room LIZJ;
    public final /* synthetic */ C0KYP LIZLLL;
    public final /* synthetic */ C154200iS LJ;

    @Override // X.InterfaceC177000m8
    public final void LIZ(Bitmap bitmap) {
        int length;
        if (this.LIZ.get() != null && bitmap != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            float width = bitmap.getWidth() * this.LIZIZ;
            float height = bitmap.getHeight() * this.LIZIZ;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(((View) this.LIZ.get()).getResources(), bitmapCopy);
            bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
            C416760GVu c416760GVu = new C416760GVu(bitmapDrawable);
            spannableStringBuilder.append((CharSequence) CardStruct.IStatusCode.DEFAULT);
            if (spannableStringBuilder.length() > 0) {
                length = spannableStringBuilder.length() - 1;
            } else {
                length = spannableStringBuilder.length();
            }
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            C786410Ut5.q2(spannableStringBuilder, new C521550Kcr(this, 2), length, spannableStringBuilder.length(), 33);
            C0KYP c0kyp = this.LIZLLL;
            if (c0kyp != null) {
                c0kyp.LIZ(spannableStringBuilder);
            }
        }
    }

    public C0KYO(C154200iS c154200iS, WeakReference weakReference, float f, Room room, C1109910ezN c1109910ezN) {
        this.LJ = c154200iS;
        this.LIZ = weakReference;
        this.LIZIZ = f;
        this.LIZJ = room;
        this.LIZLLL = c1109910ezN;
    }
}
