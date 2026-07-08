package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19MM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MM {
    public final int LIZ;
    public final ArrayList<C19MG> LIZIZ = new ArrayList<>();
    public final int LIZJ;

    public C19MM(Context context, XmlPullParser xmlPullParser) {
        this.LIZJ = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.State_android_id) {
                this.LIZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZ);
            } else if (index == R$styleable.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZJ);
                this.LIZJ = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int LIZ(float f, float f2) {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (((C19MG) ListProtector.get(this.LIZIZ, i)).LIZ(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}
