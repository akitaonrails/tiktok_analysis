package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19579111iv extends AbstractC19580211j6 {
    public final C01GW LJ;

    public final Map<String, String> LJIILIIL() {
        String str;
        String str2;
        C0R60 c0r60;
        String str3;
        C0R60 c0r602;
        C0R60 c0r603;
        HashMap map = new HashMap();
        map.put("close", "false");
        map.put("back", "true");
        map.put("hide_nav_bar", "false");
        C705930RmZ c705930RmZ = this.LIZLLL;
        String str4 = "";
        if (c705930RmZ == null || (c0r603 = c705930RmZ.LJIIZILJ) == null || (str = c0r603.LIZJ) == null) {
            str = "";
        }
        map.put("author_id", str);
        C705930RmZ c705930RmZ2 = this.LIZLLL;
        if (c705930RmZ2 == null || (c0r602 = c705930RmZ2.LJIIZILJ) == null || (str2 = c0r602.LIZLLL) == null) {
            str2 = "";
        }
        map.put("group_id", str2);
        C705930RmZ c705930RmZ3 = this.LIZLLL;
        if (c705930RmZ3 != null && (c0r60 = c705930RmZ3.LJIIZILJ) != null && (str3 = c0r60.LIZ) != null) {
            str4 = str3;
        }
        map.put("enter_from", str4);
        return map;
    }

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        interfaceC19579211iw.LIZ(this.LIZIZ.LJIL(f, f2));
    }

    public C19579111iv(Context context, C19578911it c19578911it, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ) {
        super(context, c19578911it, interactStickerStruct, c705930RmZ);
        this.LJ = C452501pT.LIZIZ(new AwS573S0100000_29(interactStickerStruct, 1110));
    }
}
