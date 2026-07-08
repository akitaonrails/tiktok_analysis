package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19MP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MP {
    public int LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public float LJIIIIZZ;
    public final C19MQ LJIIIZ;
    public final ArrayList<C19MU> LJIIJ;
    public C19MT LJIIJJI;
    public final ArrayList<C19MR> LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;

    public C19MP(C19MQ c19mq, C19MP c19mp) {
        this.LIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJI = -1;
        this.LJII = 400;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = null;
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
        this.LJIILL = -1;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJIIIZ = c19mq;
        if (c19mp != null) {
            this.LJIILL = c19mp.LJIILL;
            this.LJ = c19mp.LJ;
            this.LJFF = c19mp.LJFF;
            this.LJI = c19mp.LJI;
            this.LJII = c19mp.LJII;
            this.LJIIJ = c19mp.LJIIJ;
            this.LJIIIIZZ = c19mp.LJIIIIZZ;
            this.LJIILLIIL = c19mp.LJIILLIIL;
        }
    }

    public C19MP(C19MQ c19mq, Context context, XmlPullParser xmlPullParser) {
        this.LIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJI = -1;
        this.LJII = 400;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = null;
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
        this.LJIILL = -1;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJII = c19mq.LJIIIZ;
        this.LJIILLIIL = c19mq.LJIIJ;
        this.LJIIIZ = c19mq;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.Transition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.Transition_constraintSetEnd) {
                this.LIZJ = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZJ);
                if ("layout".equals(context.getResources().getResourceTypeName(this.LIZJ))) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJIJJ(this.LIZJ, context);
                    c19mq.LJI.append(this.LIZJ, c19mb);
                }
            } else if (index == R$styleable.Transition_constraintSetStart) {
                this.LIZLLL = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZLLL);
                if ("layout".equals(context.getResources().getResourceTypeName(this.LIZLLL))) {
                    C19MB c19mb2 = new C19MB();
                    c19mb2.LJIJJ(this.LIZLLL, context);
                    c19mq.LJI.append(this.LIZLLL, c19mb2);
                }
            } else if (index == R$styleable.Transition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.LJI = resourceId;
                    if (resourceId != -1) {
                        this.LJ = -2;
                    }
                } else if (i2 == 3) {
                    String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    this.LJFF = strXd;
                    if (strXd.indexOf("/") > 0) {
                        this.LJI = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.LJ = -2;
                    } else {
                        this.LJ = -1;
                    }
                } else {
                    this.LJ = typedArrayObtainStyledAttributes.getInteger(index, this.LJ);
                }
            } else if (index == R$styleable.Transition_duration) {
                this.LJII = typedArrayObtainStyledAttributes.getInt(index, this.LJII);
            } else if (index == R$styleable.Transition_staggered) {
                this.LJIIIIZZ = typedArrayObtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
            } else if (index == R$styleable.Transition_autoTransition) {
                this.LJIILIIL = typedArrayObtainStyledAttributes.getInteger(index, this.LJIILIIL);
            } else if (index == R$styleable.Transition_android_id) {
                this.LIZ = typedArrayObtainStyledAttributes.getResourceId(index, this.LIZ);
            } else if (index == R$styleable.Transition_transitionDisable) {
                this.LJIILJJIL = typedArrayObtainStyledAttributes.getBoolean(index, this.LJIILJJIL);
            } else if (index == R$styleable.Transition_pathMotionArc) {
                this.LJIILL = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == R$styleable.Transition_layoutDuringTransition) {
                this.LJIILLIIL = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.Transition_transitionFlags) {
                this.LJIIZILJ = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.LIZLLL == -1) {
            this.LIZIZ = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
