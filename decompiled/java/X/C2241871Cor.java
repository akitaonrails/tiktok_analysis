package X;

import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;

/* JADX INFO: renamed from: X.1Cor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241871Cor {
    public static final VisualPoetPictureStructComponent LIZ(C2241841Coo c2241841Coo) {
        ImageComponent imageComponentLIZ;
        ImageComponent imageComponentLIZ2;
        C2244091CsR c2244091CsR = c2241841Coo.image;
        if (c2244091CsR != null) {
            imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        C2244091CsR c2244091CsR2 = c2241841Coo.thumbnail;
        if (c2244091CsR2 != null) {
            imageComponentLIZ2 = C2244081CsQ.LIZJ(c2244091CsR2);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ2 = C18ZU.LIZ();
        }
        return new VisualPoetPictureStructComponent(imageComponentLIZ, imageComponentLIZ2);
    }
}
