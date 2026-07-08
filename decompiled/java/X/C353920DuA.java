package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353920DuA {
    public final NLEEditor LIZ;
    public final INLEPlayer LIZIZ;
    public final C19EG LIZJ;
    public final CreativeInfo LIZLLL;
    public final VideoPublishEditModel LJ;
    public final LifecycleOwner LJFF;
    public final InterfaceC353960DuE LJI;
    public NLETrackSlot LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(56));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 93));
    public final C353940DuC LJIIJ = new NLEEditorListener() { // from class: X.0DuC
        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
        public final void onChanged() {
            ((C1463860oCG) this.LIZ.LJIIIZ.getValue()).setDataSource(this.LIZ.LIZ().getModel());
        }
    };

    public final NLEEditor LIZ() {
        return (NLEEditor) this.LJIIIIZZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0DuC] */
    public C353920DuA(NLEEditor nLEEditor, INLEPlayer iNLEPlayer, C19EG c19eg, CreativeInfo creativeInfo, VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner, C387110FFt c387110FFt) {
        this.LIZ = nLEEditor;
        this.LIZIZ = iNLEPlayer;
        this.LIZJ = c19eg;
        this.LIZLLL = creativeInfo;
        this.LJ = videoPublishEditModel;
        this.LJFF = lifecycleOwner;
        this.LJI = c387110FFt;
    }
}
