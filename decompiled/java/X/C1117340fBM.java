package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117340fBM extends AbstractC1117310fBJ {
    public final List<String> LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return this.LJFF;
    }

    public C1117340fBM(C1117220fBA c1117220fBA) {
        super(c1117220fBA);
        this.LJFF = Collections.singletonList(EnumC921560a5a.PLAYBOOK_CREATE_SCHEMA.getStr());
        this.LJI = true;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJII(C2436109gd c2436109gd) {
        DataChannel dataChannel;
        LJIIJJI(c2436109gd);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        WeakReference<DataChannel> weakReference = AbstractC1117310fBJ.LJ;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        C0UTJ c0utjPl1 = iInteractService.Pl1(dataChannel);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIIJJI(new AwS418S0200000_17(c0utjPl1, this, 133));
            return true;
        }
        return true;
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJIIIZ(C2436109gd c2436109gd) {
        LJIIJJI(c2436109gd);
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIIJJI(new AwS418S0200000_17(c0utjPl1, this, 134));
            return true;
        }
        return true;
    }

    public final void LJIIJJI(C2436109gd c2436109gd) {
        boolean zBooleanValue;
        String strLIZ;
        String strLIZ2;
        int iIntValue;
        String strLIZ3;
        Integer numLJJLIIJ;
        String strLIZ4;
        Uri uri = c2436109gd.LIZ;
        if (uri != null) {
            String strLIZ5 = C1946707jt.LIZ(uri, "is_activity");
            if (strLIZ5 != null) {
                zBooleanValue = Boolean.valueOf(Intrinsics.LJFF(strLIZ5, "1")).booleanValue();
            } else {
                zBooleanValue = true;
            }
            this.LJI = zBooleanValue;
            String strLIZ6 = C1946707jt.LIZ(uri, "from");
            if (strLIZ6 == null) {
                strLIZ6 = "schema";
            }
            this.LJII = strLIZ6;
            String strLIZ7 = C1946707jt.LIZ(uri, "panel_entrance");
            if (strLIZ7 == null) {
                strLIZ7 = "activity";
            }
            this.LJIIIIZZ = strLIZ7;
            Uri uri2 = c2436109gd.LIZ;
            String str = "";
            if (uri2 == null || (strLIZ = C1946707jt.LIZ(uri2, "live_title")) == null) {
                strLIZ = "";
            }
            this.LJIIJ = strLIZ;
            Uri uri3 = c2436109gd.LIZ;
            if (uri3 == null || (strLIZ2 = C1946707jt.LIZ(uri3, "cover_url")) == null) {
                strLIZ2 = "";
            }
            this.LJIIJJI = strLIZ2;
            Uri uri4 = c2436109gd.LIZ;
            if (uri4 != null && (strLIZ4 = C1946707jt.LIZ(uri4, "cover_uri")) != null) {
                str = strLIZ4;
            }
            this.LJIIL = str;
            Uri uri5 = c2436109gd.LIZ;
            if (uri5 != null && (strLIZ3 = C1946707jt.LIZ(uri5, "panel_type")) != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(strLIZ3)) != null) {
                iIntValue = numLJJLIIJ.intValue();
            } else {
                iIntValue = 0;
            }
            this.LJIIIZ = iIntValue;
        }
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJFF(Context context, C2436109gd c2436109gd) throws JSONException {
        String str;
        LJIIJJI(c2436109gd);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("target_open", "3");
        jSONObject.put("panel_type", this.LJIIIZ);
        jSONObject.put("live_title", this.LJIIJ);
        jSONObject.put("cover_url", this.LJIIJJI);
        jSONObject.put("cover_uri", this.LJIIL);
        if (this.LJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_activity", str);
        jSONObject.put("from", this.LJII);
        jSONObject.put("panel_entrance", this.LJIIIIZZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://openRecord?entre_from=direct_shoot&tab=live&source_params=");
        sbLIZ.append(jSONObject);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, C2188811AlT.LIZIZ(sbLIZ), new Bundle());
        return true;
    }

    @Override // X.AbstractC1117310fBJ
    public final void LJI(Context context, C2436109gd c2436109gd, Map map) {
        LJIIJJI(c2436109gd);
        Uri uri = c2436109gd.LIZ;
        if (uri != null) {
            Uri uriBuild = uri.buildUpon().appendQueryParameter("title", C1946707jt.LIZ(uri, "live_title")).build();
            C1117220fBA c1117220fBA = this.LIZIZ;
            C2436109gd c2436109gd2 = new C2436109gd();
            c2436109gd2.LIZ = LJIIJ(uriBuild);
            c1117220fBA.LIZJ(context, c2436109gd2, map);
        }
    }
}
