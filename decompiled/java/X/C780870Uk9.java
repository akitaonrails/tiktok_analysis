package X;

import android.content.Context;
import com.bytedance.android.livesdk.api.BroadcastUserApi;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import java.io.FileNotFoundException;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Uk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780870Uk9 implements InterfaceC202141147n {
    public final long LIZ;
    public final long LIZIZ;
    public final Context LIZJ;
    public final C202139147l LIZLLL;
    public final C11NJ LJFF = new C11NJ();
    public final DialogInterfaceOnClickListenerC786020UsS LJI = new DialogInterfaceOnClickListenerC786020UsS(this, 19);
    public final DialogInterfaceOnClickListenerC786020UsS LJII = new DialogInterfaceOnClickListenerC786020UsS(this, 20);
    public int LJ = 0;

    public final HashMap<String, String> LIZIZ() {
        HashMap<String, String> map = new HashMap<>();
        map.put("room_id", String.valueOf(this.LIZ));
        map.put("anchor_id", String.valueOf(this.LIZIZ));
        return map;
    }

    @Override // X.InterfaceC202141147n
    public final void onCanceled() {
        this.LIZLLL.LIZ();
        this.LJFF.dispose();
    }

    public final void LIZJ(Throwable th) {
        String string;
        if (th instanceof FileNotFoundException) {
            string = this.LIZJ.getString(2131855118);
        } else if (th instanceof C501470JlZ) {
            string = ((C501470JlZ) th).getErrorMsg();
        } else {
            string = this.LIZJ.getString(2131856874);
        }
        this.LIZLLL.LIZ();
        C766270U4b.LJIIIZ(this.LIZJ, string);
    }

    public C780870Uk9(BaseFragment baseFragment, Room room) {
        this.LIZJ = baseFragment.getContext();
        this.LIZ = room.getId();
        this.LIZIZ = room.getOwnerUserId();
        this.LIZLLL = new C202139147l(baseFragment.getActivity(), baseFragment, "cover", 1, 1, 750, 750, this, false, false, false);
    }

    @Override // X.InterfaceC202141147n
    public final void LIZ(String str, String str2) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("avatar file don't exists in path");
            sbLIZ.append(str);
            LIZJ(new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", c0vsj));
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        ((BroadcastUserApi) c0uvwLIZ.LIZJ(BroadcastUserApi.class)).uploadAvatar(multipartTypedOutput).LJFF(new C0UO0()).LIZ(new C786210Usl(this, str, 1));
    }
}
