package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS156S1100000_7;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20409114tV extends AbstractC1117310fBJ {
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;

    @Override // X.AbstractC2436909gl
    public final List<String> LIZLLL() {
        return Collections.singletonList(EnumC921560a5a.PLAYBOOK_DETAIL_SCHEMA.getStr());
    }

    public C20409114tV(C1117220fBA c1117220fBA) {
        super(c1117220fBA);
        this.LJFF = true;
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJII(C2436109gd c2436109gd) {
        DataChannel dataChannel;
        LJIIJJI(c2436109gd.LIZ);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        WeakReference<DataChannel> weakReference = AbstractC1117310fBJ.LJ;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        C0UTJ c0utjPl1 = iInteractService.Pl1(dataChannel);
        LJIILIIL(c0utjPl1, new AwS432S0200000_31(this, c0utjPl1, 127));
        return true;
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJIIIZ(C2436109gd c2436109gd) {
        LJIIJJI(c2436109gd.LIZ);
        this.LJIIL = 1;
        C0UTJ c0utjMG2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).mG2();
        LJIILIIL(c0utjMG2, new AwS432S0200000_31(this, c0utjMG2, 128));
        return true;
    }

    public final void LJIIJJI(Uri uri) {
        boolean zLJFF;
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        int iIntValue2;
        String strLIZ4;
        String strLIZ5;
        String strLIZ6;
        Integer numLJJLIIJ;
        String strLIZ7;
        String strLIZ8;
        Integer numLJJLIIJ2;
        String strLIZ9;
        Integer numLJJLIIJ3;
        String strLIZ10;
        Integer numLJJLIIJ4;
        String strLIZ11;
        Long lLIZIZ;
        String strLIZ12;
        Long lLIZIZ2;
        String strLIZ13;
        Long lLIZIZ3;
        String strLIZ14;
        int iIntValue3 = 1;
        if (uri != null && (strLIZ14 = C1946707jt.LIZ(uri, "is_activity")) != null) {
            zLJFF = Intrinsics.LJFF(strLIZ14, "1");
        } else {
            zLJFF = true;
        }
        this.LJFF = zLJFF;
        if (uri == null || (strLIZ = C1946707jt.LIZ(uri, "from")) == null) {
            strLIZ = "schema";
        }
        this.LJI = strLIZ;
        if (uri == null || (strLIZ2 = C1946707jt.LIZ(uri, "panel_entrance")) == null) {
            strLIZ2 = "activity";
        }
        this.LJII = strLIZ2;
        String str = "";
        if (uri == null || (strLIZ3 = C1946707jt.LIZ(uri, "business_type")) == null) {
            strLIZ3 = "";
        }
        this.LJIIIIZZ = strLIZ3;
        long jLongValue3 = 0;
        if (uri != null && (strLIZ13 = C1946707jt.LIZ(uri, "playbook_id")) != null && (lLIZIZ3 = C1946707jt.LIZIZ(strLIZ13)) != null) {
            jLongValue = lLIZIZ3.longValue();
        } else {
            jLongValue = 0;
        }
        this.LJIIIZ = jLongValue;
        if (uri != null && (strLIZ12 = C1946707jt.LIZ(uri, "playbook_original_content_id")) != null && (lLIZIZ2 = C1946707jt.LIZIZ(strLIZ12)) != null) {
            jLongValue2 = lLIZIZ2.longValue();
        } else {
            jLongValue2 = 0;
        }
        this.LJIIJJI = jLongValue2;
        if (uri != null && (strLIZ11 = C1946707jt.LIZ(uri, "playbook_content_id")) != null && (lLIZIZ = C1946707jt.LIZIZ(strLIZ11)) != null) {
            jLongValue3 = lLIZIZ.longValue();
        }
        this.LJIIJ = jLongValue3;
        if (uri != null && (strLIZ10 = C1946707jt.LIZ(uri, "is_show_playbook_detail")) != null && (numLJJLIIJ4 = C500260Jjc.LJJLIIJ(strLIZ10)) != null) {
            iIntValue3 = numLJJLIIJ4.intValue();
        }
        this.LJIIL = iIntValue3;
        int iIntValue4 = 0;
        if (uri != null && (strLIZ9 = C1946707jt.LIZ(uri, "is_start_playbook")) != null && (numLJJLIIJ3 = C500260Jjc.LJJLIIJ(strLIZ9)) != null) {
            iIntValue = numLJJLIIJ3.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJIILIIL = iIntValue;
        if (uri != null && (strLIZ8 = C1946707jt.LIZ(uri, "auto_run")) != null && (numLJJLIIJ2 = C500260Jjc.LJJLIIJ(strLIZ8)) != null) {
            iIntValue2 = numLJJLIIJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LJIILJJIL = iIntValue2;
        if (uri == null || (strLIZ4 = C1946707jt.LIZ(uri, "live_title")) == null) {
            strLIZ4 = "";
        }
        this.LJIILL = strLIZ4;
        if (uri == null || (strLIZ5 = C1946707jt.LIZ(uri, "cover_url")) == null) {
            strLIZ5 = "";
        }
        this.LJIILLIIL = strLIZ5;
        if (uri != null && (strLIZ7 = C1946707jt.LIZ(uri, "cover_uri")) != null) {
            str = strLIZ7;
        }
        this.LJIIZILJ = str;
        if (uri != null && (strLIZ6 = C1946707jt.LIZ(uri, "panel_type")) != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(strLIZ6)) != null) {
            iIntValue4 = numLJJLIIJ.intValue();
        }
        this.LJIJ = iIntValue4;
    }

    public final void LJIIL(C0UTJ c0utj) {
        C20382814pG c20382814pG = new C20382814pG(this.LJIIIZ, this.LJIIJ, false, false, false, null, null, null, false, 0, this.LJII, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.LJIIIIZZ, Intrinsics.LJFF(this.LJI, "live_endpage"), 1610606588);
        c20382814pG.LJIILJJIL = new AwS240S0300000_31(this, c0utj, c20382814pG, 49);
        if (c0utj != null) {
            String str = this.LJI;
            boolean z = this.LJFF;
            boolean z2 = true;
            if (this.LJII.length() <= 0 || !this.LJFF) {
                z2 = false;
            }
            c0utj.LJJIFFI(c20382814pG, str, new C915190ZvJ(str, z, z2), EnumC20429314wl.INTERACT, true);
        }
    }

    @Override // X.AbstractC1117310fBJ
    public final boolean LJFF(Context context, C2436109gd c2436109gd) throws JSONException {
        String str;
        LJIIJJI(c2436109gd.LIZ);
        JSONObject jSONObject = new JSONObject();
        if (this.LJFF) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_activity", str);
        jSONObject.put("from", this.LJI);
        jSONObject.put("panel_entrance", this.LJII);
        jSONObject.put("business_type", this.LJIIIIZZ);
        jSONObject.put("playbook_id", this.LJIIIZ);
        jSONObject.put("playbook_original_content_id", this.LJIIJJI);
        jSONObject.put("playbook_content_id", this.LJIIJ);
        jSONObject.put("is_show_playbook_detail", this.LJIIL);
        jSONObject.put("is_start_playbook", this.LJIILIIL);
        jSONObject.put("live_title", this.LJIILL);
        jSONObject.put("cover_url", this.LJIILLIIL);
        jSONObject.put("cover_uri", this.LJIIZILJ);
        jSONObject.put("panel_type", this.LJIJ);
        jSONObject.put("target_open", "1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params=");
        sbLIZ.append(jSONObject);
        LJIILIIL(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).mG2(), new AwS156S1100000_7(context, C2188811AlT.LIZIZ(sbLIZ), 5));
        return true;
    }

    public final void LJIILIIL(C0UTJ c0utj, Function0<Unit> function0) {
        if (c0utj == null) {
            function0.invoke();
            return;
        }
        int i = this.LJIILJJIL;
        if (i == 0) {
            function0.invoke();
        } else {
            c0utj.LJIJJ(i, this.LJIIIZ, new AwS610S0100000_31(function0, (Function0<Unit>) 554));
        }
    }

    @Override // X.AbstractC1117310fBJ
    public final void LJI(Context context, C2436109gd c2436109gd, Map map) {
        LJIIJJI(c2436109gd.LIZ);
        LJIILIIL(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).mG2(), new AwS146S0400000_17(c2436109gd, (C2436109gd) this, (C20409114tV) context, (Context) map, (Map<String, String>) 8));
    }
}
