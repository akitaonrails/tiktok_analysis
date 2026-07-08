package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571400Mb4 extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C571400Mb4(AwemeDraft awemeDraft, Context context, boolean z) {
        super(2);
        this.LL = awemeDraft;
        this.LLILLJJLI = context;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
        AVMusic aVMusicM174clone;
        boolean zBooleanValue = bool.booleanValue();
        String str2 = "";
        if (!zBooleanValue) {
            C201955140j.LJIILJJIL(C0MAY.LIZIZ, "illegal draft music checked");
            AwemeDraft awemeDraft = this.LL;
            awemeDraft.LJ = null;
            awemeDraft.LJII = null;
            awemeDraft.LJIILJJIL = 0;
            awemeDraft.LJIIJ = 50;
            awemeDraft.LJJJJIZL.isDraftMusicIllegal = true;
            ((Keva) C879460Yem.LIZIZ.getValue()).storeBoolean(awemeDraft.LIZ(), false);
            C1452640nuA.LJII(null, false, this.LL.LIZ.musicBuzModel);
            C571420Mb6 c571420Mb6 = new C571420Mb6();
            c571420Mb6.LIZ = "";
            c571420Mb6.LIZIZ = "";
            c571420Mb6.LIZJ = 0;
            c571420Mb6.LJI = false;
            c571420Mb6.LJII = null;
            C0M18 c0m18 = C0M18.LIZ;
            Context context = this.LLILLJJLI;
            boolean z = this.LLILLL;
            c0m18.getClass();
            C0M18.LIZIZ(context, c571420Mb6, z);
        } else if (C19712912At.LIZ.LIZJ()) {
            C201955140j.LJIILJJIL(C0MAY.LIZIZ, "app is running background");
        } else {
            AVMusic aVMusic = this.LL.LJ;
            if (aVMusic != null && (aVMusicM174clone = aVMusic.m174clone()) != null) {
                aVMusicM174clone.setExtendMusicList(null);
                if (!C298260Bma.LIZ()) {
                    C0MJM.LIZJ(new AVMusic(), "music");
                }
                aVMusicM174clone.setMusicPriority(99);
                aVMusicM174clone.getMusicBuzCompatModel().setMusicRootPageFrom("draft_again");
                C1452640nuA.LJII(aVMusicM174clone, false, this.LL.LIZ.musicBuzModel);
                AwemeDraft awemeDraft2 = this.LL;
                String str3 = awemeDraft2.LJII;
                if (str3 != null) {
                    str2 = str3;
                }
                int i = awemeDraft2.LJIILJJIL;
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("toVideoRecord() called with: path = [");
                sbLIZ.append(str2);
                sbLIZ.append("], context = [], musicModel = [");
                sbLIZ.append(aVMusicM174clone);
                sbLIZ.append("], start = [");
                sbLIZ.append(i);
                sbLIZ.append(']');
                C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
                try {
                    new JSONObject().put("route", "1");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1398110mUD.LIZ = "draft_page";
                C571420Mb6 c571420Mb62 = new C571420Mb6();
                c571420Mb62.LIZ = aVMusicM174clone.getMusicId();
                c571420Mb62.LIZIZ = str2;
                c571420Mb62.LIZJ = i;
                c571420Mb62.LJI = zBooleanValue;
                c571420Mb62.LJII = aVMusicM174clone;
                MusicBuzModel musicBuzModel = this.LL.LIZ.musicBuzModel;
                c571420Mb62.LJIIIIZZ = musicBuzModel.musicOrigin;
                c571420Mb62.LJIIIZ = musicBuzModel.musicSelectedFromDraft;
                C0M18 c0m182 = C0M18.LIZ;
                Context context2 = this.LLILLJJLI;
                boolean z2 = this.LLILLL;
                c0m182.getClass();
                C0M18.LIZIZ(context2, c571420Mb62, z2);
            }
        }
        return Unit.LIZ;
    }
}
