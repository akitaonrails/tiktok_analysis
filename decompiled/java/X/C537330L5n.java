package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0L5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537330L5n implements InterfaceC522520KeQ {
    public final C19EG LL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public C537330L5n(C19EG c19eg) {
        this.LL = c19eg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB] */
    public static void LIZJ(String str, C528230Knd c528230Knd) {
        String str2;
        ?? r1;
        AIGCEntranceInfo aIGCEntranceInfo;
        ?? c0lab = new C0LAB();
        String str3 = null;
        if (c528230Knd != null) {
            str2 = c528230Knd.LIZIZ;
        } else {
            str2 = null;
        }
        c0lab.LJ("creation_id", str2);
        if (c528230Knd != null) {
            r1 = c528230Knd.LJ;
        } else {
            r1 = 0;
        }
        c0lab.LIZ(r1, "is_draft");
        if (c528230Knd != null) {
            str3 = c528230Knd.LIZ;
        }
        c0lab.LJ("shoot_way", str3);
        if (c528230Knd != null && (aIGCEntranceInfo = c528230Knd.LJIILL) != null) {
            C548810Lfj.LIZ(c0lab, str, aIGCEntranceInfo);
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) throws Throwable {
        EnumC23225098d enumC23225098dLIZ;
        C198H c198hLC;
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        boolean z = false;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2497109qT c2497109qT = C2497109qT.LIZ;
            MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, 0);
            c2497109qT.getClass();
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(C2471909mP.LJIJ(mediaModel), null);
            if (bitmapLIZLLL == null) {
                enumC23225098dLIZ = EnumC23225098d.DECODE_FAIL;
            } else {
                enumC23225098dLIZ = C2497109qT.LIZ(bitmapLIZLLL);
            }
            if (enumC23225098dLIZ == EnumC23225098d.HAS_FACE) {
                z = true;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C547220LdA c547220LdALIZLLL = C547160Ld4.LIZLLL(C547160Ld4.LIZIZ(), C547300LdI.LIZJ, C547180Ld6.LIZ(C548010LeR.LIZLLL, "face_detect"));
            C547220LdA.LIZIZ(c547220LdALIZLLL, new C142900gd(jCurrentTimeMillis2, jCurrentTimeMillis));
            c547220LdALIZLLL.LIZ();
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai theater face detect result:");
            sbLIZ.append(z);
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL);
                if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null && (c198hLC instanceof SelectMaterialScene)) {
                    C01TT.LIZLLL(new AwS252S0300000_8(c198hLC, intent, this, 0));
                    return;
                }
                return;
            }
            C528230Knd c528230KndLIZ = C523870Kgb.LIZ(intent);
            C1397580mTM c1397580mTM = new C1397580mTM(new C1361400lX0(this.LL, R.style.y0));
            c1397580mTM.LJFF(2131826216);
            c1397580mTM.LIZ(2131826215);
            C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(this, c528230KndLIZ, 3));
            new C1397510mTF(c1397580mTM).LIZLLL();
            LIZJ("ttcrt_discern_face_pop", c528230KndLIZ);
        }
    }
}
