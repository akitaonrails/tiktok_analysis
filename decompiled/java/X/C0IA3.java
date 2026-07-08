package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* JADX INFO: renamed from: X.0IA3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0IA3 {
    public final EnumC429240GsM LIZ;
    public final PublishModel LIZIZ;
    public Bitmap LIZJ;

    public Bitmap LIZ() {
        return this.LIZJ;
    }

    public PublishModel LIZIZ() {
        return this.LIZIZ;
    }

    public void LIZJ(Bitmap bitmap) {
        this.LIZJ = bitmap;
    }

    public C0IA3(EnumC429240GsM enumC429240GsM, PublishModel publishModel, Bitmap bitmap) {
        this.LIZ = enumC429240GsM;
        this.LIZIZ = publishModel;
        this.LIZJ = bitmap;
    }
}
