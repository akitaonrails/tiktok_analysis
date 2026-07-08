package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;

/* JADX INFO: renamed from: X.0ma6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401760ma6 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(C1401760ma6 c1401760ma6, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C1401760ma6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1401760ma6 c1401760ma6, Bitmap bitmap) {
        if (bitmap != null) {
            DialogC1367400lgg dialogC1367400lgg = (DialogC1367400lgg) c1401760ma6.l0;
            TextView textView = dialogC1367400lgg.LLJI;
            Context context = dialogC1367400lgg.LLJJIJI;
            String string = dialogC1367400lgg.LLJJIII.extras.getString("comment_author_name", "");
            ((DialogC1367400lgg) c1401760ma6.l0).LLJJIII.extras.getString("comment_reply_user_name", "");
            String string2 = ((DialogC1367400lgg) c1401760ma6.l0).LLJJIII.extras.getString("comment_text", "");
            int iLIZJ = (int) C12ES.LIZJ(16.0f, ((DialogC1367400lgg) c1401760ma6.l0).LLJJIJI);
            int i = ((DialogC1367400lgg) c1401760ma6.l0).LLJJIII.extras.getInt("comment_media_type", 0);
            CommentSharePackage.Companion.getClass();
            textView.setText(C1351870lHd.LIZ(context, string, string2, bitmap, iLIZJ, i));
        }
    }

    public static final void LIZ$1(C1401760ma6 c1401760ma6, Bitmap bitmap) {
        if (bitmap != null) {
            C427870Gq9 liveShareUserIconFromXml = ((C1380730m2B) c1401760ma6.l0).getLiveShareUserIconFromXml();
            ((C1380730m2B) c1401760ma6.l0).getClass();
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f = iMin / 2;
            canvas.drawCircle(f, f, f, paint);
            liveShareUserIconFromXml.setImageBitmap(bitmapCreateBitmap);
            InterfaceC1380740m2C interfaceC1380740m2C = ((C1380730m2B) c1401760ma6.l0).LLILZLL;
            if (interfaceC1380740m2C != null) {
                interfaceC1380740m2C.LJIJJLI();
                return;
            }
            return;
        }
        ((C1380730m2B) c1401760ma6.l0).getLiveShareUserIconFromXml().setImageDrawable(((C1380730m2B) c1401760ma6.l0).getDefaultDrawable());
        InterfaceC1380740m2C interfaceC1380740m2C2 = ((C1380730m2B) c1401760ma6.l0).LLILZLL;
        if (interfaceC1380740m2C2 == null) {
            return;
        }
        interfaceC1380740m2C2.LJIJJLI();
    }

    public static final void onFailed$1(C1401760ma6 c1401760ma6, Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        ((C1380730m2B) c1401760ma6.l0).getLiveShareUserIconFromXml().setImageDrawable(((C1380730m2B) c1401760ma6.l0).getDefaultDrawable());
        InterfaceC1380740m2C interfaceC1380740m2C = ((C1380730m2B) c1401760ma6.l0).LLILZLL;
        if (interfaceC1380740m2C != null) {
            interfaceC1380740m2C.LLJJIJIIJIL();
        }
    }
}
