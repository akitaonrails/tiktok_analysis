package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0bnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987110bnJ implements InterfaceC781210Ukh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C987110bnJ c987110bnJ) {
        ((AbstractC922600a7G) c987110bnJ.l1).LLILZLL.remove(c987110bnJ.s0);
    }

    public static final void run$1(C987110bnJ c987110bnJ) {
        C939000aXi c939000aXi = C939000aXi.LIZ;
        DataChannel dataChannel = (DataChannel) c987110bnJ.l1;
        String str = c987110bnJ.s0;
        c939000aXi.getClass();
        C939000aXi.LJII(dataChannel, null, str);
        C19487111Lx c19487111Lx = C939000aXi.LIZJ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        C939000aXi.LIZJ = null;
    }

    public C987110bnJ(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
