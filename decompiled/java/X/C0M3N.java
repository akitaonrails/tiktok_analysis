package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M3N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3N extends AbstractC562050M2p<C0M3P> {
    public final C561140Lzc LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final C1322110kVd LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final Context LLIZ;

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        final C0M3P c0m3p = (C0M3P) c561950M2f;
        C0VSJ c0vsj = new C0VSJ(c0m3p.LJFF);
        if (c0vsj.exists()) {
            C1324750kZt.LJIIIZ(this.LLILZ, Uri.fromFile(c0vsj).toString(), -1, -1);
        } else {
            AwemeDraft awemeDraftLIZ = this.LL.LIZ(c0m3p.LJ);
            if (awemeDraftLIZ == null) {
                C201955140j.LJ("PostedDraftEntranceViewHolder: bindDraftCover -> draft is null");
                C1AF0.LIZJ("queryNull -> PostedDraftEntranceViewHolder : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.LLIZ.getResources().getDimensionPixelOffset(R.dimen.to);
                C0MZ9.LJIIIIZZ(awemeDraftLIZ, new VideoCoverConfig(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0M3O
                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverFailed(int i2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PostedDraftEntranceViewHolder :onGetVideoCoverFailed: errorCode = ");
                        sbLIZ.append(i2);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PostedDraftEntranceViewHolder : bindDraftCover -> creationId = ");
                        sbLIZ.append(c0m3p.LJ);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        C201955140j.LIZ("PostedDraftEntranceViewHolder : onGetVideoCoverSuccess: ");
                        this.LLILZ.setImageBitmap(bitmap);
                    }
                });
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) this.itemView.getContext().getText(2131846786));
        sbLIZ.append(": ");
        sbLIZ.append(c0m3p.LJI);
        this.LLILZIL.setText(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 147), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC580930MqR(this, 5));
        if (c0m3p.LIZIZ) {
            C786410Ut5.LLIL(this.LLILZIL, 8);
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        } else {
            C786410Ut5.LLIL(this.LLILZIL, 0);
            C786410Ut5.LJLLLLLL(0, this.LLILZLL);
        }
    }

    public C0M3N(View view, C561140Lzc c561140Lzc, Function0<Unit> function0, Function0<Unit> function02) {
        super(view);
        this.LL = c561140Lzc;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = (C1322110kVd) view.findViewById(R.id.cover);
        this.LLILZIL = (TextView) view.findViewById(R.id.rm8);
        this.LLILZLL = view.findViewById(R.id.h7y);
        this.LLIZ = view.getContext();
    }
}
