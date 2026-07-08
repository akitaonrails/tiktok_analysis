package Y;

import X.AnonymousClass1298;
import X.C0CHQ;
import X.C0WYJ;
import X.C0WYK;
import X.C1336210ksN;
import X.C15IP;
import X.C15LG;
import X.C1C7U;
import X.C204657156h;
import X.C204658156i;
import X.C204665156p;
import X.C20684815ws;
import X.C2250131D5f;
import X.C2344009Gk;
import X.C426090GnH;
import X.C786410Ut5;
import X.InterfaceC20596015iY;
import X.InterfaceC345370DgN;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.aweme.storage.m2.M2StorageCleanImpl;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.performanceopt.api.IStorageApi;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS7S1201000_31 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        List<InterfaceC345370DgN> listLIZ;
        IStorageApi iStorageApiLJFF = ((M2StorageCleanImpl) this.l1).LJFF();
        long jLIZJ = iStorageApiLJFF != null ? iStorageApiLJFF.LIZJ() : Long.MAX_VALUE;
        boolean z = jLIZJ <= ((Number) C2250131D5f.LIZJ.getValue()).longValue() * ((long) 1048576);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clean_type", this.i3);
        jSONObject.put("scheme", this.s0);
        C0WYK c0wyk = new C0WYK();
        C0WYJ.LJJIFFI((Context) this.l2, c0wyk);
        IStorageApi iStorageApiLJFF2 = ((M2StorageCleanImpl) this.l1).LJFF();
        long jLIZ = iStorageApiLJFF2 != null ? iStorageApiLJFF2.LIZ((Context) this.l2) : Long.MAX_VALUE;
        jSONObject.put("storage_cache_size", c0wyk.LJIIJ);
        jSONObject.put("storage_data_size", c0wyk.LJIIIZ);
        jSONObject.put("storage_app_size", c0wyk.LJIIIIZZ);
        jSONObject.put("total_storage_size", c0wyk.LIZ());
        jSONObject.put("storage_available_internal_size", jLIZJ);
        jSONObject.put("storage_available_external_size", jLIZ);
        jSONObject.put("storage_enable_clean_cache", z);
        AppLogNewUtils.onEventV3("perf_m2_storage_clean_start", jSONObject);
        if (z) {
            C1336210ksN.LJ = true;
            ((M2StorageCleanImpl) this.l1).LJ().storeBoolean("M2_STORAGE_CLEAN_EXECUTE", true);
            InterfaceC20596015iY interfaceC20596015iY = ((M2StorageCleanImpl) this.l1).LIZJ;
            long jLIZJ2 = 0;
            if (interfaceC20596015iY != null && (listLIZ = interfaceC20596015iY.LIZ()) != null) {
                Iterator<InterfaceC345370DgN> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    jLIZJ2 += it2.next().LIZJ();
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clean_type", this.i3);
            jSONObject2.put("scheme", this.s0);
            C0WYJ.LJJIFFI((Context) this.l2, c0wyk);
            jSONObject2.put("storage_cache_size", c0wyk.LJIIJ);
            jSONObject2.put("storage_data_size", c0wyk.LJIIIZ);
            jSONObject2.put("storage_app_size", c0wyk.LJIIIIZZ);
            jSONObject2.put("total_storage_size", c0wyk.LIZ());
            long jLJI = C0WYJ.LJI();
            jSONObject2.put("storage_available_internal_size", jLJI);
            jSONObject2.put("storage_available_external_size", C0WYJ.LJFF((Context) this.l2));
            jSONObject2.put("storage_clean_size", Math.max(jLIZJ2, jLJI - jLIZJ));
            jSONObject2.put("storage_enable_clean_cache", true);
            AppLogNewUtils.onEventV3("perf_m2_storage_clean_end", jSONObject2);
        }
    }

    public final void LIZ$1() {
        if (!((C204657156h) this.l1).LIZ) {
            C204658156i.LIZ.LIZJ();
            return;
        }
        C204658156i c204658156i = C204658156i.LIZ;
        if (C204658156i.LIZIZ()) {
            ((C204657156h) this.l1).LIZJ();
            return;
        }
        Function0<Boolean> function0 = ((C204657156h) this.l1).LJ;
        if (function0 == null || !function0.invoke().booleanValue()) {
            c204658156i.LIZJ();
            return;
        }
        Integer numValueOf = Integer.valueOf(((AnonymousClass1298) this.l2).getBindingAdapterPosition());
        int iIntValue = numValueOf.intValue() >= 0 ? numValueOf.intValue() : ((AnonymousClass1298) this.l2).getAdapterPosition();
        if (iIntValue != this.i3) {
            c204658156i.LIZJ();
            return;
        }
        MusicModel musicModelLIZLLL = ((C204657156h) this.l1).LIZLLL(iIntValue);
        if (!Intrinsics.LJFF(musicModelLIZLLL != null ? musicModelLIZLLL.getMusicId() : null, this.s0)) {
            c204658156i.LIZJ();
        } else if (!((AnonymousClass1298) this.l2).W5()) {
            c204658156i.LIZJ();
        } else {
            ((Keva) C204658156i.LIZLLL.getValue()).storeBoolean(C786410Ut5.j4("has_lyric_tag_shown_%s", Arrays.copyOf(new Object[]{C0CHQ.LIZ().getAccountService().getCurrentUserID()}, 1)), true);
            ((C204657156h) this.l1).LIZJ();
        }
    }

    public final void LIZ$2() {
        if (!((C204657156h) this.l1).LIZ) {
            C204658156i.LIZ.LIZJ();
            return;
        }
        C204658156i c204658156i = C204658156i.LIZ;
        if (C204658156i.LIZIZ()) {
            ((C204657156h) this.l1).LJFF = false;
            c204658156i.LIZJ();
            return;
        }
        Function0<Boolean> function0 = ((C204657156h) this.l1).LJ;
        if (function0 == null || !function0.invoke().booleanValue()) {
            c204658156i.LIZJ();
            return;
        }
        Integer numValueOf = Integer.valueOf(((AnonymousClass1298) this.l2).getBindingAdapterPosition());
        int iIntValue = numValueOf.intValue() >= 0 ? numValueOf.intValue() : ((AnonymousClass1298) this.l2).getAdapterPosition();
        if (iIntValue != this.i3) {
            c204658156i.LIZJ();
            return;
        }
        MusicModel musicModelLIZLLL = ((C204657156h) this.l1).LIZLLL(iIntValue);
        if (!Intrinsics.LJFF(musicModelLIZLLL != null ? musicModelLIZLLL.getMusicId() : null, this.s0)) {
            c204658156i.LIZJ();
            return;
        }
        if (((C204657156h) this.l1).LJ(musicModelLIZLLL)) {
            c204658156i.LIZJ();
            return;
        }
        if (!((AnonymousClass1298) this.l2).L5()) {
            c204658156i.LIZJ();
            return;
        }
        if (!((AnonymousClass1298) this.l2).W5()) {
            c204658156i.LIZJ();
            return;
        }
        ((Keva) C204658156i.LIZLLL.getValue()).storeBoolean(C786410Ut5.j4("has_lyric_tag_shown_%s", Arrays.copyOf(new Object[]{C0CHQ.LIZ().getAccountService().getCurrentUserID()}, 1)), true);
        C204657156h c204657156h = (C204657156h) this.l1;
        c204657156h.LJFF = false;
        HandlerHook.viewPostDelay(((AnonymousClass1298) this.l2).itemView, new ARunnableS131S0100000_31(c204657156h, 155), 2600L);
    }

    public final void LIZ$3() {
        C426090GnH c426090GnH;
        if (!((C204665156p) this.l1).LIZ) {
            C204658156i.LIZ.LIZJ();
            return;
        }
        C204658156i c204658156i = C204658156i.LIZ;
        if (C204658156i.LIZIZ()) {
            ((C204665156p) this.l1).LIZ();
            return;
        }
        Function0<Boolean> function0 = ((C204665156p) this.l1).LIZLLL;
        if (function0 == null || !function0.invoke().booleanValue()) {
            c204658156i.LIZJ();
            return;
        }
        Integer numValueOf = Integer.valueOf(((RecyclerView.ViewHolder) this.l2).getBindingAdapterPosition());
        int iIntValue = numValueOf.intValue() >= 0 ? numValueOf.intValue() : ((RecyclerView.ViewHolder) this.l2).getAdapterPosition();
        if (iIntValue != this.i3) {
            c204658156i.LIZJ();
            return;
        }
        MusicModel musicModelLIZIZ = ((C204665156p) this.l1).LIZIZ(iIntValue);
        if (!Intrinsics.LJFF(musicModelLIZIZ != null ? musicModelLIZIZ.getMusicId() : null, this.s0)) {
            c204658156i.LIZJ();
            return;
        }
        C15IP c15ip = (C15IP) ((RecyclerView.ViewHolder) this.l2);
        if (c15ip.LLLL) {
            Object tag = c15ip.itemView.getTag(R.id.x1u);
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(tag, bool) && (c426090GnH = c15ip.LLLJIL) != null) {
                C786410Ut5.LLFII(0, c426090GnH);
                if (c426090GnH.isAttachedToWindow() && c426090GnH.isLaidOut()) {
                    c426090GnH.LIZJ();
                } else {
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c426090GnH, new ARunnableS75S0200000_6(c426090GnH, c426090GnH, 75));
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("position", "music_panel");
                C20684815ws.LJIILLIIL("ttcrt_lyrics_guide_show", c2344009Gk.LIZ);
                c15ip.itemView.setTag(R.id.x1u, bool);
                ((Keva) C204658156i.LIZLLL.getValue()).storeBoolean(C786410Ut5.j4("has_lyric_tag_shown_%s", Arrays.copyOf(new Object[]{C0CHQ.LIZ().getAccountService().getCurrentUserID()}, 1)), true);
                ((C204665156p) this.l1).LIZ();
                return;
            }
        }
        c204658156i.LIZJ();
    }

    public static final void run$0(ARunnableS7S1201000_31 aRunnableS7S1201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("M2StorageCleanImpl@70f0.cleanCacheForM2$1");
        try {
            aRunnableS7S1201000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2StorageCleanImpl@70f0.cleanCacheForM2$1");
    }

    public static final void run$1(ARunnableS7S1201000_31 aRunnableS7S1201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ToolsLyricTagAnimTriggerHelper@bead.onItemViewHolderAttached$1");
        try {
            aRunnableS7S1201000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolsLyricTagAnimTriggerHelper@bead.onItemViewHolderAttached$1");
    }

    public static final void run$2(ARunnableS7S1201000_31 aRunnableS7S1201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ToolsLyricTagAnimTriggerHelper@bead.tryTriggerAnimAt$1");
        try {
            aRunnableS7S1201000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolsLyricTagAnimTriggerHelper@bead.tryTriggerAnimAt$1");
    }

    public static final void run$3(ARunnableS7S1201000_31 aRunnableS7S1201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailDownloadHelperExtKt@103e.tryUseSoundWithoutWaiting$goNextAndDownload$1$1");
        try {
            ((MusicModel) aRunnableS7S1201000_31.l1).setDownloadComplete(true);
            ((MusicModel) aRunnableS7S1201000_31.l1).setDownloadAfterGoNext(true);
            C15LG c15lg = (C15LG) aRunnableS7S1201000_31.l2;
            String str = aRunnableS7S1201000_31.s0;
            c15lg.eL(aRunnableS7S1201000_31.i3, (MusicModel) aRunnableS7S1201000_31.l1, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailDownloadHelperExtKt@103e.tryUseSoundWithoutWaiting$goNextAndDownload$1$1");
    }

    public static final void run$4(ARunnableS7S1201000_31 aRunnableS7S1201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LyricTagAnimTriggerHelper@af0e.onItemViewHolderAttached$1");
        try {
            aRunnableS7S1201000_31.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyricTagAnimTriggerHelper@af0e.onItemViewHolderAttached$1");
    }

    public ARunnableS7S1201000_31(Object obj, int i, String str, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i3 = i;
        this.s0 = str;
        this.l2 = obj2;
    }
}
