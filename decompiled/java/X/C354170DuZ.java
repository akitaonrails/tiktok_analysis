package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354170DuZ extends C09AY implements InterfaceC1631620sYq<Boolean, Boolean, List<? extends BeatInfo>, Unit> {
    public final /* synthetic */ C354160DuY LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ C354540DvA LLILLL;
    public final /* synthetic */ NLEVideoEffect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354170DuZ(C354160DuY c354160DuY, NLETrackSlot nLETrackSlot, C354540DvA c354540DvA, NLEVideoEffect nLEVideoEffect) {
        super(3);
        this.LL = c354160DuY;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = c354540DvA;
        this.LLILZ = nLEVideoEffect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Boolean bool2, List<? extends BeatInfo> list) throws JSONException {
        bool.booleanValue();
        bool2.booleanValue();
        this.LL.LJ(this.LLILLJJLI, this.LLILLL, list, this.LLILZ, true);
        return Unit.LIZ;
    }
}
