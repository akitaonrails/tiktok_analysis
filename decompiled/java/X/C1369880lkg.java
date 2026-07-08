package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0lkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369880lkg extends AbstractC1370920lmM {
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1371590lnR LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ InterfaceC1362720lZ8 LLILZLL;

    @Override // X.AbstractC1370920lmM, X.InterfaceC1369750lkT
    public final void LJIIIIZZ() {
        this.LLILZLL.F8(new C572630Md3());
    }

    @Override // X.AbstractC1370920lmM
    public final void LIZ(InterfaceC1370310llN interfaceC1370310llN, int i) {
        Integer numValueOf;
        if (C1369870lkf.LJIL) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", C1369870lkf.LJ);
            linkedHashMap.put("panel_source", C1369870lkf.LJII);
            linkedHashMap.put("item_type", C1369870lkf.LJIIIIZZ);
            linkedHashMap.put("item_id", C1369870lkf.LJIIIZ);
            linkedHashMap.put("unique_id", C1369870lkf.LJIILJJIL);
            linkedHashMap.put("action_id", C1369870lkf.LJIIZILJ);
            Boolean bool = C1369870lkf.LJIJJ;
            if (bool != null) {
                numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("enabled", numValueOf);
            linkedHashMap.put("scenario_status", Integer.valueOf(C1369870lkf.LJIJJLI));
            linkedHashMap.put("detail_tab_name", C1369870lkf.LJJIIZI);
            linkedHashMap.put("group_id", C1369870lkf.LJIIJ);
            linkedHashMap.put("panel_type", C1369870lkf.LJJJJI);
            if (i != -1) {
                linkedHashMap.put("icon_position", Integer.valueOf(i));
            }
            Integer num = C1369870lkf.LJJJI;
            if (num != null) {
                linkedHashMap.put("live_pic_cnt", num);
            }
            InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
            if (interfaceC1367490lgp != null) {
                interfaceC1367490lgp.LIZ("action_clicked_end", linkedHashMap);
            }
        }
        if (!this.LLILZ.LJIJJ.LJIIJJI(interfaceC1370310llN, this.LLILLL)) {
            interfaceC1370310llN.LJJJJLL(this.LLILZIL, this.LLILZ.LJIJJ);
        }
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        if (interfaceC1366500lfE != null) {
            interfaceC1366500lfE.LIZ();
        }
        C1371590lnR c1371590lnR = this.LLILZ;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZIZ(this.LLILLL, c1371590lnR.LJIJJ, interfaceC1370310llN);
        }
        if (interfaceC1370310llN.enable() && interfaceC1370310llN.LJJIL()) {
            this.LLILZLL.F8(new C572630Md3());
        } else {
            if (!interfaceC1370310llN.LJJLIIIJL()) {
                return;
            }
            this.LLILZLL.F8(new C572630Md3());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369880lkg(Context context, C1371590lnR c1371590lnR, View view, InterfaceC1362720lZ8 interfaceC1362720lZ8, BaseSharePackage baseSharePackage) {
        super(context, baseSharePackage);
        this.LLILLL = context;
        this.LLILZ = c1371590lnR;
        this.LLILZIL = view;
        this.LLILZLL = interfaceC1362720lZ8;
    }
}
