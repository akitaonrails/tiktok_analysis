package X;

import a6n.a;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lnn.q;

/* JADX INFO: renamed from: X.1Drl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269151Drl extends C09AY implements Function0<C577600Ml4> {
    public C2269151Drl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ml4] */
    @Override // kotlin.jvm.functions.Function0
    public final C577600Ml4 invoke() {
        return new IOpenTextNextService() { // from class: X.0Ml4
            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
            public final void openTextModeCanvasV2(C19EG c19eg, Parcelable parcelable) {
                LIZ(c19eg, (ShortVideoContext) parcelable, null, 0, null);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
            public final void textCanvasGoNext(C19EG c19eg, Bundle bundle) {
                String string = bundle.getString("creation_id");
                if (string == null) {
                    string = C0DMI.LIZ();
                }
                CreativeInfo creativeInfo = new CreativeInfo(string, 0, null, 6, null);
                C0MUK.LJIIJ(bundle, C0MUK.LJIIIIZZ());
                C537520L6g.LJFF(bundle, creativeInfo);
                C786410Ut5.LJJIJL(bundle, "workspace", C14D2.LIZ(creativeInfo));
                LIZ(c19eg, C1443540nfU.LIZIZ(bundle), null, 0, null);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService
            public final void openTextModeCanvas(IRecordEnv iRecordEnv, int i, Function1<? super Boolean, Unit> function1) {
                FaceStickerBean faceStickerBeanJr;
                a aVar = (a) iRecordEnv;
                C19EG c19egLIZ = aVar.LIZ();
                ShortVideoContext shortVideoContextLIZLLL = aVar.LIZLLL();
                q value = aVar.LJ().getValue();
                if (value != null) {
                    faceStickerBeanJr = value.jr();
                } else {
                    faceStickerBeanJr = null;
                }
                LIZ(c19egLIZ, shortVideoContextLIZLLL, faceStickerBeanJr, i, function1);
            }

            /* JADX WARN: Removed duplicated region for block: B:109:0x04bd  */
            /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LIZ(X.C19EG r26, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r27, com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r28, int r29, kotlin.jvm.functions.Function1 r30) {
                /*
                    Method dump skipped, instruction units count: 1247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C577600Ml4.LIZ(X.19EG, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, int, kotlin.jvm.functions.Function1):void");
            }
        };
    }
}
