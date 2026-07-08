package X;

import android.opengl.GLES20;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273180jEi {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C1273180jEi(int i) {
        this.LIZ = i;
        if (i != 0) {
            if (i == 1) {
                this.LIZIZ = C1273510jFF.LIZ("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES vTexture;\nvarying vec2 vTextureCo;\nuniform int useOesTexture;\nvoid main(){\n    gl_FragColor = texture2D(vTexture, vTextureCo);\n}");
            }
        } else {
            this.LIZIZ = C1273510jFF.LIZ(u.LJJIFFI(u.LJJIFFI("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES vTexture;\nvarying vec2 vTextureCo;\nuniform int useOesTexture;\nvoid main(){\n    gl_FragColor = texture2D(vTexture, vTextureCo);\n}", "#extension GL_OES_EGL_image_external : require", "", false), "samplerExternalOES", "sampler2D", false));
        }
        this.LIZJ = GLES20.glGetAttribLocation(this.LIZIZ, "aVertexCo");
        this.LIZLLL = GLES20.glGetAttribLocation(this.LIZIZ, "aTextureCo");
        this.LJ = GLES20.glGetUniformLocation(this.LIZIZ, "uTextureMatrix");
        this.LJFF = GLES20.glGetUniformLocation(this.LIZIZ, "vTexture");
    }
}
