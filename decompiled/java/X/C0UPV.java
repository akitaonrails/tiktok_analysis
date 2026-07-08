package X;

import Y.AfS181S0100000_12;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import webcast.api.room.CreateInfoRequest;

/* JADX INFO: renamed from: X.0UPV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UPV extends AbstractDialogC972150bPB implements View.OnClickListener {
    public String LLJI;
    public final String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public final Room LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public TextView LLJJJJ;
    public C11JF LLJJJJJIL;
    public final Context LLJJJJLIIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g5_;
    }

    public final void LJLI() {
        if (this.LLJJJJ == null || TextUtils.isEmpty(this.LLJJJIL) || TextUtils.equals(this.LLJJJJ.getText(), this.LLJJJIL)) {
            return;
        }
        this.LLJJJJ.setText(this.LLJJJIL);
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        LJLI();
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/MEgL5LdgC6Jf0jPwLGJj67qbkd3OnhKV/o01w=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
        super.show();
        c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, c19gi, c0wzw, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jlj) {
            C781270Ukn.LJFF().Zz1();
            Context context = getContext();
            C784600UqA c784600UqA = new C784600UqA(this.LLJI);
            c784600UqA.LIZIZ = C497740JfY.LJIJI(2131853476);
            C784610UqB.LIZIZ(context, c784600UqA);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("thirdparty_take_guide");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJIIJJI("live");
            c474500IjALIZ.LJIILL("click");
            c474500IjALIZ.LJJII("live_room", "request_page");
            c474500IjALIZ.LIZ();
            return;
        }
        if (id == R.id.ut3) {
            LJL(true, CertProviderManagerKt.findCert("bpea-211", 1476399121), this.LLJILJIL);
        } else {
            if (id != R.id.usy) {
                return;
            }
            LJL(false, CertProviderManagerKt.findCert("bpea-212", 1476399122), this.LLJILJILJ);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        this.LLJI = LiveObsHelpPageSetting.INSTANCE.getValue();
        int iLastIndexOf = this.LLJIJIL.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            String str = this.LLJIJIL;
            this.LLJILJILJ = str;
            this.LLJILJIL = str;
        } else {
            int i = iLastIndexOf + 1;
            this.LLJILJIL = this.LLJIJIL.substring(0, i);
            this.LLJILJILJ = this.LLJIJIL.substring(i);
        }
        findViewById(R.id.y3j);
        this.LLJILLL = (TextView) findViewById(R.id.jlj);
        this.LLJJ = (TextView) findViewById(R.id.ut4);
        this.LLJJI = (TextView) findViewById(R.id.usz);
        this.LLJJIII = (TextView) findViewById(R.id.ut3);
        this.LLJJIJI = (TextView) findViewById(R.id.usy);
        findViewById(R.id.usu);
        findViewById(R.id.usv);
        findViewById(R.id.usw);
        this.LLJJIJIIJIL = (TextView) findViewById(R.id.usx);
        findViewById(R.id.ut1);
        this.LLJJJJ = (TextView) findViewById(R.id.ut2);
        C786410Ut5.T7(this.LLJILLL, this);
        C786410Ut5.T7(this.LLJJIII, this);
        C786410Ut5.T7(this.LLJJIJI, this);
        this.LLJJ.setText(this.LLJILJIL);
        this.LLJJI.setText(this.LLJILJILJ);
        C786410Ut5.LLIL(this.LLJJIJIIJIL, 0);
        C19EG c19egLJ = C500260Jjc.LJ(this.LLJJJJLIIL);
        if (c19egLJ != null) {
            try {
                stringExtra = c19egLJ.getIntent().getStringExtra("live.intent.extra.LIVE_PC_TIPS");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            this.LLJJJIL = stringExtra;
        }
        if (TextUtils.isEmpty(this.LLJJJIL)) {
            this.LLJJJIL = getContext().getString(2131844554);
            LJLI();
            CreateInfoRequest createInfoRequest = new CreateInfoRequest();
            HashMap<String, String> mapLIZ = C0USY.LIZ.LIZ();
            HashMap<String, String> mapLIZ2 = C0USY.LIZIZ.LIZ();
            HashMap<String, String> mapLIZ3 = C0USY.LIZJ.LIZ();
            if (mapLIZ == null) {
                createInfoRequest.bannerShowStats = new HashMap();
            } else {
                createInfoRequest.bannerShowStats = mapLIZ;
            }
            if (mapLIZ2 == null) {
                createInfoRequest.bannerClickStats = new HashMap();
            } else {
                createInfoRequest.bannerClickStats = mapLIZ2;
            }
            if (mapLIZ3 == null) {
                createInfoRequest.bannerCloseStats = new HashMap();
            } else {
                createInfoRequest.bannerCloseStats = mapLIZ3;
            }
            createInfoRequest.hasEnteredTryMode = InterfaceC772600USk.zf.LIZIZ().booleanValue();
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            this.LLJJJJJIL = (C11JF) C01QD.LIZ().LIZ().getPreviewRoomCreateInfo(createInfoRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 1), new AfS181S0100000_12(this, 2));
            return;
        }
        LJLI();
    }

    public C0UPV(C19EG c19eg, Room room, String str) {
        super(c19eg);
        this.LLJJJJLIIL = c19eg;
        this.LLJIJIL = str;
        this.LLJJIJIL = room;
    }

    public final void LJL(boolean z, Cert cert, String str) {
        int i;
        String str2;
        String idStr;
        String str3;
        try {
            C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(C497740JfY.LJII(), "clipboard"), ClipData.newPlainText(str, str), cert);
            if (z) {
                i = 2131844058;
            } else {
                i = 2131844178;
            }
            C766270U4b.LIZLLL(i);
            if (z) {
                str2 = "livesdk_server_url_copy";
            } else {
                str2 = "livesdk_stream_key_copy";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
            Room room = this.LLJJIJIL;
            if (room == null) {
                idStr = "";
            } else {
                idStr = room.getIdStr();
            }
            c474500IjALIZ.LJJII(idStr, "room_id");
            if (this.LLJJJ) {
                str3 = "live_start";
            } else {
                str3 = "live_room";
            }
            c474500IjALIZ.LJJII(str3, "request_page");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C766270U4b.LIZLLL(2131853434);
        }
    }
}
