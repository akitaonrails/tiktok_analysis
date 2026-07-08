package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20168213vk implements InterfaceC20168913vr {
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public final Context LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 17));
    public final Keva LIZLLL = Keva.getRepo("story_effect");

    public C20168213vk(Context context) {
        this.LIZIZ = context;
    }

    public final String LIZIZ(long j, String str) {
        boolean z;
        String string;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (string = this.LIZLLL.getString(str, null)) != null && string.length() != 0 && C2286708xd.LIZJ(string)) {
            Keva keva = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_cache_at_ms");
            long j2 = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
            if (j2 <= 0) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j2;
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= j) {
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    @Override // X.InterfaceC20168913vr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData r24, java.lang.String r25, X.InterfaceC1364105Vn<? super X.C20170413w6> r26) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20168213vk.LIZ(com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData, java.lang.String, X.05Vn):java.lang.Object");
    }
}
