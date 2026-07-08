package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.app.R$styleable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19MR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MR implements View.OnClickListener {
    public final C19MP LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        C19MP c19mp = this.LL;
        C19MQ c19mq = c19mp.LJIIIZ;
        C21526919Ml c21526919Ml = c19mq.LIZ;
        if (!c21526919Ml.LLJ) {
            return;
        }
        if (c19mp.LIZLLL == -1) {
            int currentState = c21526919Ml.getCurrentState();
            if (currentState == -1) {
                c21526919Ml.E0(this.LL.LIZJ);
                return;
            }
            C19MP c19mp2 = this.LL;
            C19MP c19mp3 = new C19MP(c19mp2.LJIIIZ, c19mp2);
            c19mp3.LIZLLL = currentState;
            c19mp3.LIZJ = this.LL.LIZJ;
            c21526919Ml.setTransition(c19mp3);
            c21526919Ml.e0(1.0f);
            return;
        }
        C19MP c19mp4 = c19mq.LIZJ;
        int i = this.LLILLL;
        if ((i & 1) == 0 && (i & 256) == 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 16) == 0 && (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            if (c19mp4 != c19mp) {
                c21526919Ml.setTransition(c19mp);
            }
            if (c21526919Ml.getCurrentState() != c21526919Ml.getEndState() && c21526919Ml.getProgress() <= 0.5f) {
                z2 = false;
            } else {
                z = false;
            }
        }
        C19MP c19mp5 = this.LL;
        if (c19mp5 != c19mp4) {
            int i2 = c19mp5.LIZJ;
            int i3 = c19mp5.LIZLLL;
            if (i3 == -1) {
                if (c21526919Ml.LLILZIL == i2) {
                    return;
                }
            } else {
                int i4 = c21526919Ml.LLILZIL;
                if (i4 != i3 && i4 != i2) {
                    return;
                }
            }
        }
        if (z && (this.LLILLL & 1) != 0) {
            c21526919Ml.setTransition(c19mp5);
            c21526919Ml.e0(1.0f);
            return;
        }
        if (z2 && (this.LLILLL & 16) != 0) {
            c21526919Ml.setTransition(c19mp5);
            c21526919Ml.e0(0.0f);
        } else if (z && (this.LLILLL & 256) != 0) {
            c21526919Ml.setTransition(c19mp5);
            c21526919Ml.setProgress(1.0f);
        } else {
            if (!z2 || (this.LLILLL & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
                return;
            }
            c21526919Ml.setTransition(c19mp5);
            c21526919Ml.setProgress(0.0f);
        }
    }

    public C19MR(Context context, C19MP c19mp, XmlPullParser xmlPullParser) {
        this.LLILLJJLI = -1;
        this.LLILLL = 17;
        this.LL = c19mp;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.OnClick);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.OnClick_targetId) {
                this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(index, this.LLILLJJLI);
            } else if (index == R$styleable.OnClick_clickAction) {
                this.LLILLL = typedArrayObtainStyledAttributes.getInt(index, this.LLILLL);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(C21526919Ml c21526919Ml, int i, C19MP c19mp) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.LLILLJJLI;
        View viewFindViewById = c21526919Ml;
        if (i2 != -1) {
            viewFindViewById = c21526919Ml.findViewById(i2);
        }
        if (viewFindViewById == null) {
            return;
        }
        int i3 = c19mp.LIZLLL;
        int i4 = c19mp.LIZJ;
        if (i3 == -1) {
            C786410Ut5.I7(this, viewFindViewById);
            return;
        }
        int i5 = this.LLILLL;
        int i6 = i5 & 1;
        boolean z5 = true;
        if (i6 != 0 && i == i3) {
            z = true;
        } else {
            z = false;
        }
        if ((i5 & 256) != 0 && i == i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i6 != 0 && i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z3 | z6;
        if ((i5 & 16) != 0 && i == i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z7 | z4;
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 || i != i4) {
            z5 = false;
        }
        if (z8 | z5) {
            C786410Ut5.I7(this, viewFindViewById);
        }
    }
}
