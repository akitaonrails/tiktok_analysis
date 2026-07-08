package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.AbstractC960460b6K;
import X.C1117360fBO;
import X.C1570050qxX;
import X.C1954807lC;
import X.C19719512Dh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C766270U4b;
import X.C935720aSQ;
import X.C935770aSV;
import X.C935780aSW;
import X.C945400ai2;
import X.C945420ai4;
import X.C945470ai9;
import X.C945480aiA;
import X.C945490aiB;
import X.EnumC945440ai6;
import X.EnumC945500aiC;
import X.InterfaceC945510aiD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class PlaybookSelectionDialog extends BasePlaybookSheetFragment implements Function2<C945420ai4, Boolean, Unit> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonGio/LSY4ICA9DCwtJSA0";
    public final int LLJZIJLIL = 1;
    public final String LLL;
    public final Function1<List<C935770aSV>, Unit> LLLF;
    public final Function2<Long, String, Unit> LLLFF;
    public final Function1<EnumC945440ai6, Unit> LLLFFI;
    public TextView LLLFZ;
    public RecyclerView LLLI;
    public final C1117360fBO LLLII;
    public TextView LLLIIII;
    public final List<C935770aSV> LLLIIIIL;
    public EnumC945440ai6 LLLIIIL;
    public InterfaceC945510aiD LLLIIL;
    public final String LLLIILIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9s;
    }

    public final boolean BS() {
        int size = ((ArrayList) this.LLLIIIIL).size();
        List<?> list = this.LLLII.LL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof C945420ai4) && ((C945420ai4) obj).LIZIZ != 0) {
                arrayList.add(obj);
            }
        }
        return size == arrayList.size();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC945510aiD interfaceC945510aiD = this.LLLIIL;
        if (interfaceC945510aiD != null) {
            interfaceC945510aiD.onDestroy();
        }
        this.LLLIIL = null;
        this.LLLFFI.invoke(this.LLLIIIL);
        this.LLLIIIL = EnumC945440ai6.NORMAL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLIILIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r10 = r16.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r10.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r9 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r9.LIZ.mUser.getId() != r7.LIZ) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r6.add(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ES(java.util.List<X.C935810aSZ> r16, java.util.List<X.C935770aSV> r17) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog.ES(java.util.List, java.util.List):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C945420ai4 c945420ai4, Boolean bool) {
        Object next;
        C945420ai4 c945420ai42 = c945420ai4;
        boolean zBooleanValue = bool.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("itemClick selectUserData:");
        sbLIZ.append(c945420ai42.LIZ.LIZ.mUser.getId());
        sbLIZ.append(" selected:");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("PlaybookSelectionDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJZIJLIL == 1) {
            ((ArrayList) this.LLLIIIIL).clear();
        }
        if (zBooleanValue && this.LLJZIJLIL > 1 && ((ArrayList) this.LLLIIIIL).size() == this.LLJZIJLIL) {
            C766270U4b.LIZLLL(2131854135);
        } else {
            LinkPlayerInfo linkPlayerInfo = c945420ai42.LIZ.LIZ;
            if (zBooleanValue) {
                ((ArrayList) this.LLLIIIIL).add(new C935770aSV(linkPlayerInfo.mUser.getId(), linkPlayerInfo.mInteractIdStr));
                c945420ai42.LIZIZ = 2;
            } else {
                Iterator it2 = ((ArrayList) this.LLLIIIIL).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C935770aSV) next).LIZ == linkPlayerInfo.mUser.getId()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C19719512Dh.LIZ(this.LLLIIIIL).remove(next);
                c945420ai42.LIZIZ = 1;
            }
            InterfaceC945510aiD interfaceC945510aiD = this.LLLIIL;
            if (interfaceC945510aiD != null) {
                interfaceC945510aiD.LIZ();
            }
        }
        return Unit.LIZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        if (textView != null) {
            textView.setText(this.LLL);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.cq0);
        this.LLLFZ = textView2;
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0ai8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (this.LL.BS()) {
                    PlaybookSelectionDialog playbookSelectionDialog = this.LL;
                    playbookSelectionDialog.getClass();
                    C20441214yg.LIZIZ("PlaybookSelectionDialog", "deselectAll");
                    ((ArrayList) playbookSelectionDialog.LLLIIIIL).clear();
                    InterfaceC945510aiD interfaceC945510aiD = playbookSelectionDialog.LLLIIL;
                    if (interfaceC945510aiD != null) {
                        interfaceC945510aiD.LIZ();
                        return;
                    }
                    return;
                }
                PlaybookSelectionDialog playbookSelectionDialog2 = this.LL;
                playbookSelectionDialog2.getClass();
                C20441214yg.LIZIZ("PlaybookSelectionDialog", "selectedAll");
                ((ArrayList) playbookSelectionDialog2.LLLIIIIL).clear();
                InterfaceC945510aiD interfaceC945510aiD2 = playbookSelectionDialog2.LLLIIL;
                if (interfaceC945510aiD2 == null) {
                    return;
                }
                interfaceC945510aiD2.LIZ();
            }
        }, textView2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvw);
        this.LLLI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        RecyclerView recyclerView2 = this.LLLI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLLII);
        }
        InterfaceC945510aiD interfaceC945510aiD = this.LLLIIL;
        if (interfaceC945510aiD != null) {
            interfaceC945510aiD.onCreate();
        }
        TextView textView3 = (TextView) view.findViewById(R.id.cuk);
        this.LLLIIII = textView3;
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0ai5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("click btnSave selectedUserList.size:");
                sbLIZ.append(((ArrayList) this.LL.LLLIIIIL).size());
                C20441214yg.LIZIZ("PlaybookSelectionDialog", C2188811AlT.LIZIZ(sbLIZ));
                PlaybookSelectionDialog playbookSelectionDialog = this.LL;
                InterfaceC945510aiD interfaceC945510aiD2 = playbookSelectionDialog.LLLIIL;
                if (interfaceC945510aiD2 == null || !interfaceC945510aiD2.LIZIZ(playbookSelectionDialog.LLLIIIIL)) {
                    PlaybookSelectionDialog playbookSelectionDialog2 = this.LL;
                    playbookSelectionDialog2.LLLF.invoke(playbookSelectionDialog2.LLLIIIIL);
                }
                PlaybookSelectionDialog playbookSelectionDialog3 = this.LL;
                playbookSelectionDialog3.LLLIIIL = EnumC945440ai6.BOTTOM_BUTTON;
                playbookSelectionDialog3.close(1);
            }
        }, textView3);
        InterfaceC945510aiD interfaceC945510aiD2 = this.LLLIIL;
        if (interfaceC945510aiD2 != null) {
            interfaceC945510aiD2.LIZ();
        }
    }

    public PlaybookSelectionDialog(EnumC945500aiC enumC945500aiC, DataChannel dataChannel, String str, Function1 function1, Function2 function2, Function1 function12) {
        InterfaceC945510aiD c935720aSQ;
        this.LLL = str;
        this.LLLF = function1;
        this.LLLFF = function2;
        this.LLLFFI = function12;
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C945420ai4.class, new AbstractC960460b6K<C945420ai4, C945400ai2>(this) { // from class: X.0ai3
            public final Function2<C945420ai4, Boolean, Unit> LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = this;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C945400ai2(C786410Ut5.Td(layoutInflater, R.layout.h_o, viewGroup, false), this.LIZIZ);
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                C945400ai2 c945400ai2 = (C945400ai2) viewHolder;
                C945420ai4 c945420ai4 = (C945420ai4) obj;
                if (!list.isEmpty()) {
                    c945400ai2.getLayoutPosition();
                    c945400ai2.L5(c945420ai4);
                } else {
                    if (C13LP.LJJJLL(list) instanceof Integer) {
                        int iIntValue = ((Integer) C13LP.LJJJJZI(list)).intValue();
                        c945400ai2.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updatePayload selectedState:");
                        sbLIZ.append(iIntValue);
                        C20441214yg.LIZIZ("PlaybookSelectUserViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                        c945400ai2.N5(iIntValue);
                        return;
                    }
                    LIZJ(c945400ai2, c945420ai4);
                }
            }
        });
        this.LLLII = c1117360fBO;
        this.LLLIIIIL = new ArrayList();
        this.LLLIIIL = EnumC945440ai6.NORMAL;
        this.LLLIILIL = "selection";
        int i = C945490aiB.LIZ[enumC945500aiC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c935720aSQ = new C935780aSW(new C945480aiA(this));
            } else {
                throw new C1954807lC();
            }
        } else {
            c935720aSQ = new C935720aSQ(dataChannel, new C945470ai9(this), function2);
        }
        this.LLLIIL = c935720aSQ;
    }
}
