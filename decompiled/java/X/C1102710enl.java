package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceActivityInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0enl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102710enl implements InterfaceC1102870eo1 {
    public static final Set<String> LJIIJ = C13LQ.LJLIIL(new String[]{"btm_pre", "btm_ppre", "btm_pre_show_id"});
    public final C1099960ejK LIZ;
    public final ViewGroup LIZIZ;
    public final List<EnumC1102740eno> LIZJ;
    public final AbstractC1102590enZ LIZLLL;
    public final EnumC1088870eRR LJ;
    public final Map<EnumC1102740eno, InterfaceC1102810env> LJFF;
    public final Map<EnumC1102740eno, InterfaceC785120Ur0> LJI = new EnumMap(EnumC1102740eno.class);
    public final LinkedList<EnumC1102740eno> LJII = new LinkedList<>();
    public EnumC1102740eno LJIIIIZZ;
    public C19ME LJIIIZ;

    public final String LJ() {
        EcommerceActivityInfo ecommerceActivityInfo;
        Room room = (Room) this.LIZ.LIZJ.gg0(RoomChannel.class);
        if (room == null || (ecommerceActivityInfo = room.ecommerceActivityInfo) == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(ecommerceActivityInfo.activityId);
        if (lValueOf.longValue() > 0) {
            return lValueOf.toString();
        }
        return null;
    }

    @Override // X.InterfaceC1102870eo1
    public final void release() {
        for (EnumC1102740eno enumC1102740eno : this.LJII) {
            InterfaceC785120Ur0 interfaceC785120Ur0 = (InterfaceC785120Ur0) ((EnumMap) this.LJI).get(enumC1102740eno);
            if (interfaceC785120Ur0 != null) {
                View contentView = interfaceC785120Ur0.getContentView();
                C0JGN c0jgn = C0JGL.LIZ;
                C0JGL.LIZIZ(this.LIZ.LIZLLL, enumC1102740eno, contentView);
                InterfaceC1102810env interfaceC1102810env = this.LJFF.get(enumC1102740eno);
                if (interfaceC1102810env != null) {
                    interfaceC1102810env.LIZLLL(this.LIZ, interfaceC785120Ur0);
                }
                C786410Ut5.LJJJLZIJ(interfaceC785120Ur0.LIZJ(), this.LIZIZ);
                ((EnumMap) this.LJI).remove(enumC1102740eno);
            }
        }
        this.LJII.clear();
    }

    @Override // X.InterfaceC1102870eo1
    public final List<EnumC1102740eno> getButtons() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1102870eo1
    public final InterfaceC1103130eoR LIZIZ(EnumC1102740eno enumC1102740eno) {
        return (InterfaceC1103130eoR) ((EnumMap) this.LJI).get(enumC1102740eno);
    }

    @Override // X.InterfaceC1102870eo1
    public final void LIZJ(EnumC1102740eno enumC1102740eno) {
        Fragment fragment;
        InterfaceC785120Ur0 interfaceC785120Ur0 = (InterfaceC785120Ur0) ((EnumMap) this.LJI).get(enumC1102740eno);
        if (interfaceC785120Ur0 == null) {
            return;
        }
        View contentView = interfaceC785120Ur0.getContentView();
        C0JGN c0jgn = C0JGL.LIZ;
        C0JGL.LIZIZ(this.LIZ.LIZLLL, enumC1102740eno, contentView);
        LifecycleOwner lifecycleOwner = this.LIZ.LIZIZ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            C1102860eo0.LIZ(enumC1102740eno, fragment).vQ2(fragment);
        }
        InterfaceC1102810env interfaceC1102810env = this.LJFF.get(enumC1102740eno);
        if (interfaceC1102810env != null) {
            interfaceC1102810env.LIZLLL(this.LIZ, interfaceC785120Ur0);
        }
        C786410Ut5.LJJJLZIJ(interfaceC785120Ur0.LIZJ(), this.LIZIZ);
        ((EnumMap) this.LJI).remove(enumC1102740eno);
        this.LJII.remove(enumC1102740eno);
        if (this.LJIIIIZZ == enumC1102740eno) {
            this.LJIIIIZZ = null;
            C19ME c19me = this.LJIIIZ;
            if (c19me != null) {
                C786410Ut5.X5(c19me, this.LIZIZ);
            }
            this.LJIIIZ = null;
        }
    }

    public final int LIZLLL(EnumC1102740eno enumC1102740eno) {
        LinkedList<EnumC1102740eno> linkedList = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (EnumC1102740eno enumC1102740eno2 : linkedList) {
            if (this.LIZJ.indexOf(enumC1102740eno2) < this.LIZJ.indexOf(enumC1102740eno)) {
                arrayList.add(enumC1102740eno2);
            }
        }
        return Math.min(arrayList.size(), this.LIZIZ.getChildCount());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:36|(4:38|(1:44)|45|(4:287|57|(1:59)(1:62)|63)(0))|64|(2:66|(2:68|(4:70|(2:74|(3:78|(1:80)(1:88)|81))|82|(9:89|(1:91)|92|(1:96)|97|(1:101)|102|(1:104)(1:106)|105)(2:86|87))(2:107|108))(2:109|110))(5:111|(1:113)|114|(1:116)(1:161)|117)|118|(4:120|(1:124)|125|(1:129))(1:160)|130|(8:132|(1:134)|135|(2:137|(1:139)(1:159))|140|(1:142)|143|(1:145))|146|(1:148)|149|(2:151|(2:153|(2:155|(2:157|158))(2:162|(9:209|248|(2:256|(1:260))|289|268|(2:270|(5:274|(1:276)|277|(1:279)(1:282)|280))|281|285|286)(10:166|(8:169|(1:171)|172|(6:176|(1:178)|179|(1:199)(1:183)|184|(1:186)(1:198))|187|(1:301)(3:294|192|(1:304)(3:297|197|305))|298|167)|291|200|(1:202)|203|(4:206|(3:307|208|310)(1:309)|308|204)|306|212|(7:214|(1:216)(2:263|(1:265)(1:266))|217|(1:223)|224|(1:226)(1:262)|227)(1:267))))(1:210))(1:211)|228|(2:236|(3:244|(1:246)(1:261)|247))|248|(4:250|254|256|(2:258|260))|289|268|(0)|281|285|286) */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x077d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x077e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0745 A[Catch: all -> 0x077d, TryCatch #1 {all -> 0x077d, blocks: (B:268:0x0736, B:270:0x0745, B:272:0x074f, B:274:0x0753, B:276:0x0757, B:277:0x075e, B:279:0x0767, B:280:0x076b, B:282:0x0778, B:281:0x0772), top: B:289:0x0736 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    @Override // X.InterfaceC1102870eo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.EnumC1102740eno r22, final X.InterfaceC1102810env r23) {
        /*
            Method dump skipped, instruction units count: 1939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102710enl.LIZ(X.0eno, X.0env):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.EnumC1102740eno r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102710enl.LJFF(X.0eno, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1102710enl(C1099960ejK c1099960ejK, ViewGroup viewGroup, List<? extends EnumC1102740eno> list, AbstractC1102590enZ abstractC1102590enZ, EnumC1088870eRR enumC1088870eRR, Map<EnumC1102740eno, InterfaceC1102810env> map) {
        this.LIZ = c1099960ejK;
        this.LIZIZ = viewGroup;
        this.LIZJ = list;
        this.LIZLLL = abstractC1102590enZ;
        this.LJ = enumC1088870eRR;
        this.LJFF = map;
    }
}
