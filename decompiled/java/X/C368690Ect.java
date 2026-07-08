package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0Ect, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368690Ect {
    public static final int LJIIJ = C376310EpB.LLILZ;
    public static final int LJIIJJI = C376310EpB.LLILZIL;
    public final Context LIZ;
    public final int LIZIZ;
    public final NLETrackSlot LIZJ;
    public final InterfaceC369210Edj LIZLLL;
    public final Function1<String, Unit> LJ;
    public C376310EpB LJFF;
    public final boolean LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public int LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Ed7] */
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
    public final C376310EpB LIZ() {
        C376310EpB c376310EpB = this.LJFF;
        if (c376310EpB == null) {
            final int iLIZ = 0;
            c376310EpB = new C376310EpB(this.LIZ, 0);
            this.LJFF = c376310EpB;
            c376310EpB.setScaleType(ImageView.ScaleType.CENTER_CROP);
            View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 154);
            if (C1848410yCV.LIZ) {
                aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
            }
            a aVar = new a(aCListenerS140S0100000_5);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c376310EpB);
            }
            c376310EpB.setOnClickListener(aVar);
            if (!this.LJI) {
                C370720EgA c370720EgA = C370720EgA.LIZ;
                int i = (int) this.LJII;
                c370720EgA.getClass();
                iLIZ = C370720EgA.LIZ(i);
            }
            Bitmap bitmapLIZ = this.LIZLLL.LIZ(iLIZ, this.LJIIIIZZ);
            if (bitmapLIZ == null) {
                this.LIZLLL.LIZIZ(new InterfaceC358430E3l() { // from class: X.0Ed7
                    @Override // X.InterfaceC358430E3l
                    public final boolean LIZLLL() {
                        C376310EpB c376310EpB2;
                        C368690Ect c368690Ect = this.LIZ;
                        Bitmap bitmapLIZ2 = c368690Ect.LIZLLL.LIZ(iLIZ, c368690Ect.LJIIIIZZ);
                        if (bitmapLIZ2 == null || (c376310EpB2 = this.LIZ.LJFF) == null || !c376310EpB2.isAttachedToWindow()) {
                            return false;
                        }
                        C376310EpB c376310EpB3 = this.LIZ.LJFF;
                        if (c376310EpB3 != null) {
                            c376310EpB3.setImageBitmap(bitmapLIZ2);
                        }
                        return true;
                    }
                });
            } else {
                C376310EpB c376310EpB2 = this.LJFF;
                if (c376310EpB2 != null) {
                    HandlerHook.viewPost(c376310EpB2, new ARunnableS74S0200000_5(this, bitmapLIZ, 58));
                    return c376310EpB;
                }
            }
        }
        return c376310EpB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C368690Ect(Context context, int i, NLETrackSlot nLETrackSlot, InterfaceC369210Edj interfaceC369210Edj, Function1<? super String, Unit> function1) {
        long timeClipStart;
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = nLETrackSlot;
        this.LIZLLL = interfaceC369210Edj;
        this.LJ = function1;
        this.LJI = C351220Dpo.LLJJIJIL(nLETrackSlot);
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentAudio != null) {
            timeClipStart = nLESegmentAudio.getTimeClipStart();
        } else {
            timeClipStart = 0;
        }
        this.LJII = timeClipStart / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C370720EgA.LIZ.getClass();
        this.LJIIIIZZ = C370720EgA.LIZIZ(nLETrackSlot);
    }
}
