package X;

import Y.AObserverS170S0200000_5;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386270FCn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EditorProTTSHelper LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ ReadTextEffectBean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C386270FCn(EditorProTTSHelper editorProTTSHelper, NLETrackSlot nLETrackSlot, File file, String str, String str2, int i, ReadTextEffectBean readTextEffectBean, boolean z, Function1<? super Boolean, Unit> function1, boolean z2) {
        super(0);
        this.LL = editorProTTSHelper;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = file;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = readTextEffectBean;
        this.LLIZLLLIL = z;
        this.LLJ = function1;
        this.LLJI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C0E48 c0e48;
        NLEEditor nLEEditorLJI;
        C0EVZ c0evz = C0EVZ.LIZ;
        C0EVZ.LIZJ(this.LLILLJJLI, this.LL.LLILZ);
        ((C386320FCs) this.LL.LLILZIL.getValue()).LIZ.add(this.LLILLL.getAbsolutePath());
        C0EVZ.LIZLLL(c0evz, this.LL.LLILZ, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILLL.getAbsolutePath(), this.LLILZLL, this.LLIZ, null, 128);
        this.LLILLJJLI.setExtra("is_editorpro_tts", "1");
        if (this.LLIZLLLIL) {
            EditorProTTSHelper editorProTTSHelper = this.LL;
            editorProTTSHelper.LLJ = new EditRepeatMusicPlayer(editorProTTSHelper.LL, this.LLILLL.getAbsolutePath());
            final MutableLiveData mutableLiveDataWith = LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE);
            EditorProTTSHelper editorProTTSHelper2 = this.LL;
            final AObserverS170S0200000_5 aObserverS170S0200000_5 = new AObserverS170S0200000_5(mutableLiveDataWith, editorProTTSHelper2, 30);
            mutableLiveDataWith.observe(editorProTTSHelper2.LL, aObserverS170S0200000_5);
            EditRepeatMusicPlayer editRepeatMusicPlayer = this.LL.LLJ;
            if (editRepeatMusicPlayer != null) {
                editRepeatMusicPlayer.LIZ(0);
            }
            EditRepeatMusicPlayer editRepeatMusicPlayer2 = this.LL.LLJ;
            if (editRepeatMusicPlayer2 != null) {
                editRepeatMusicPlayer2.LLILZLL = new C11Z3() { // from class: X.0FCo
                    @Override // X.C11Z3
                    public final void LIZ() {
                    }

                    @Override // X.C11Z3
                    public final void LIZIZ() {
                        mutableLiveDataWith.removeObserver(aObserverS170S0200000_5);
                    }
                };
            }
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LL.LLILZLL;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.dismiss();
            C785410UrT.LIZ(progressDialogC1399790mWv);
        }
        this.LLJ.invoke(Boolean.TRUE);
        if (this.LLJI && (c0e48 = this.LL.LLILZ) != null && (nLEEditorLJI = c0e48.LLFII().LJI()) != null) {
            C350410DoV.LIZJ(nLEEditorLJI, C0E1V.TEXT_TO_SPEECH.getNameId(), false, 5);
        }
        return Unit.LIZ;
    }
}
