package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;

/* JADX INFO: renamed from: X.0niI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445280niI {
    public static final C346940Diu LIZ(ImageTransformParams imageTransformParams) {
        C346940Diu c346940Diu = new C346940Diu();
        c346940Diu.LIZJ = Float.valueOf(imageTransformParams.getScale());
        c346940Diu.LJ = Float.valueOf(imageTransformParams.getTransformY());
        c346940Diu.LIZLLL = Float.valueOf(imageTransformParams.getTransformX());
        c346940Diu.LJFF = Float.valueOf(imageTransformParams.getRotation());
        c346940Diu.LJI = Boolean.valueOf(imageTransformParams.getMirrorX());
        c346940Diu.LJII = Boolean.valueOf(imageTransformParams.getMirrorY());
        return c346940Diu;
    }
}
