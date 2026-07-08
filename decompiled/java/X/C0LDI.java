package X;

import Y.ARunnableS27S0110000_8;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.gamora.layout.LayoutNLETrackStub;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;

/* JADX INFO: renamed from: X.0LDI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0LDI extends FrameLayout implements InterfaceC576410Mj9 {
    public final Rect LL;
    public LayoutNLETrackStub LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub == null || layoutNLETrackStub.LLJJIJI) {
            return;
        }
        layoutNLETrackStub.LLJJIJI = true;
        layoutNLETrackStub.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub == null || !layoutNLETrackStub.LLJJIJI) {
            return;
        }
        layoutNLETrackStub.LLJJIJI = false;
        layoutNLETrackStub.LIZIZ();
    }

    public final LayoutNLETrackStub getTrackStub() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC576410Mj9
    public final void LIZJ(Rect rect) {
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub != null) {
            layoutNLETrackStub.LIZJ(rect);
        }
    }

    @Override // X.InterfaceC576960Mk2
    public final void onScale(float f) {
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub != null) {
            float f2 = layoutNLETrackStub.LLJILJILJ;
            if (f != f2) {
                layoutNLETrackStub.LLJILLL = f2;
                layoutNLETrackStub.LLJILJILJ = f;
                layoutNLETrackStub.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC576960Mk2
    public final void LJFF(int i, int i2) {
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub != null) {
            int i3 = -i;
            if (layoutNLETrackStub.LLJJ != i3 || layoutNLETrackStub.LLJJI != i2) {
                layoutNLETrackStub.LLJJ = i3;
                layoutNLETrackStub.LLJJI = i2;
                layoutNLETrackStub.LIZIZ();
            }
        }
    }

    public C0LDI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Rect();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC576410Mj9
    public InterfaceC576410Mj9 LIZLLL(LayoutItemMedia layoutItemMedia, NLEModel nLEModel, Rect rect, ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        LayoutNLETrackStub layoutNLETrackStub;
        C0L9K c0l9k;
        Long lValueOf;
        new C538360L9m(nLEModel);
        Long lValueOf2 = null;
        C0MSD c0msd = null;
        if (nLEModel == null) {
            layoutNLETrackStub = null;
        } else {
            C0LDD.LIZ.getClass();
            layoutNLETrackStub = new LayoutNLETrackStub(nLEModel, C0LDC.LIZIZ.getValue());
        }
        this.LLILLJJLI = layoutNLETrackStub;
        if (layoutItemMedia.mediaType == LayoutMediaType.PHOTO) {
            c0l9k = C0L9K.IMAGE;
        } else {
            c0l9k = C0L9K.VIDEO;
        }
        if (C299870BpB.LIZ() == 1) {
            LayoutNLETrackStub layoutNLETrackStub2 = this.LLILLJJLI;
            if (layoutNLETrackStub2 != null) {
                String str = layoutItemMedia.filePath;
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null) {
                    lValueOf = Long.valueOf(mainTrack.getDuration());
                } else {
                    lValueOf = null;
                }
                layoutNLETrackStub2.LLJJJJJIL = new C0MSD(str, c0l9k, lValueOf, layoutNLETrackStub2);
            }
            C0MSO c0mso = C0MSO.LJFF;
            LayoutNLETrackStub layoutNLETrackStub3 = this.LLILLJJLI;
            if (layoutNLETrackStub3 != null) {
                c0msd = layoutNLETrackStub3.LLJJJJJIL;
            }
            c0mso.LIZJ(c0msd, false);
        } else {
            LayoutNLETrackStub layoutNLETrackStub4 = this.LLILLJJLI;
            if (layoutNLETrackStub4 != null) {
                String str2 = layoutItemMedia.filePath;
                NLETrack mainTrack2 = layoutNLETrackStub4.LL.getMainTrack();
                if (mainTrack2 != null) {
                    lValueOf2 = Long.valueOf(mainTrack2.getDuration());
                }
                layoutNLETrackStub4.LIZ(str2, c0l9k, lValueOf2, true);
            }
        }
        LayoutNLETrackStub layoutNLETrackStub5 = this.LLILLJJLI;
        if (layoutNLETrackStub5 != null) {
            layoutNLETrackStub5.LIZJ(rect);
            layoutNLETrackStub5.LIZLLL(this.LL);
            layoutNLETrackStub5.LLJJIII = aRunnableS27S0110000_8;
        }
        return this;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        this.LL.set(rect);
        LayoutNLETrackStub layoutNLETrackStub = this.LLILLJJLI;
        if (layoutNLETrackStub != null) {
            layoutNLETrackStub.LIZLLL(this.LL);
        }
    }
}
