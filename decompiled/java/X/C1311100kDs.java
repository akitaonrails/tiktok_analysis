package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.lynx.service.text.TextResourceLoader;
import com.lynx.textra.BBufferInputStream;
import com.lynx.textra.JavaCanvasHelper;
import com.lynx.textra.JavaFontManager;

/* JADX INFO: renamed from: X.0kDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311100kDs extends JavaCanvasHelper {
    public Canvas LIZ;
    public Drawable.Callback LIZIZ;

    public C1311100kDs(JavaFontManager javaFontManager) {
        super(javaFontManager);
    }

    @Override // com.lynx.textra.JavaCanvasHelper
    public final void drawRunDelegate(BBufferInputStream bBufferInputStream) {
        int i = bBufferInputStream.readInt();
        float f = bBufferInputStream.readFloat();
        float f2 = bBufferInputStream.readFloat();
        float f3 = bBufferInputStream.readFloat();
        float f4 = bBufferInputStream.readFloat();
        bBufferInputStream.readFloat();
        TextResourceLoader.DrawImage(i, this.LIZ, f, f2, f3, f4, this.LIZIZ);
    }
}
