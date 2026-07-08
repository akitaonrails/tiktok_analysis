package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import com.ss.android.ugc.aweme.app.R$styleable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19MG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MG {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;

    public C19MG(Context context, XmlPullParser xmlPullParser) {
        this.LIZ = Float.NaN;
        this.LIZIZ = Float.NaN;
        this.LIZJ = Float.NaN;
        this.LIZLLL = Float.NaN;
        this.LJ = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.LJ);
                this.LJ = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == R$styleable.Variant_region_heightLessThan) {
                this.LIZLLL = typedArrayObtainStyledAttributes.getDimension(index, this.LIZLLL);
            } else if (index == R$styleable.Variant_region_heightMoreThan) {
                this.LIZIZ = typedArrayObtainStyledAttributes.getDimension(index, this.LIZIZ);
            } else if (index == R$styleable.Variant_region_widthLessThan) {
                this.LIZJ = typedArrayObtainStyledAttributes.getDimension(index, this.LIZJ);
            } else if (index == R$styleable.Variant_region_widthMoreThan) {
                this.LIZ = typedArrayObtainStyledAttributes.getDimension(index, this.LIZ);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean LIZ(float f, float f2) {
        if (!Float.isNaN(this.LIZ) && f < this.LIZ) {
            return false;
        }
        if (!Float.isNaN(this.LIZIZ) && f2 < this.LIZIZ) {
            return false;
        }
        if (!Float.isNaN(this.LIZJ) && f > this.LIZJ) {
            return false;
        }
        if (!Float.isNaN(this.LIZLLL) && f2 > this.LIZLLL) {
            return false;
        }
        return true;
    }
}
