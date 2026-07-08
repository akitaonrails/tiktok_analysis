package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookConditionSelectDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderGuideSheetFragment;
import com.bytedance.android.livesdk.condition.Condition;
import java.util.Iterator;

/* JADX INFO: renamed from: X.16HT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HT implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public C16HT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C16HT c16ht, Object obj) {
        C20368314mv next;
        Condition condition;
        Iterator<C20368314mv> it2 = ((PlaybookConditionSelectDialog) c16ht.l0).LLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20368314mv c20368314mv = next;
        if (c20368314mv != null && (condition = c20368314mv.LIZ) != null) {
            PlaybookConditionSelectDialog playbookConditionSelectDialog = (PlaybookConditionSelectDialog) c16ht.l0;
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            String strES = playbookConditionSelectDialog.ES();
            String str = condition.name;
            if (str == null) {
                str = "";
            }
            C978360bZC.LJIJ(strES, str, playbookConditionSelectDialog.LLLFF.invoke(), playbookConditionSelectDialog.LLLFFI.invoke(), playbookConditionSelectDialog.LLLFZ.invoke().booleanValue(), C20359314lT.LJIIIIZZ(condition), playbookConditionSelectDialog.LLJZIJLIL);
            playbookConditionSelectDialog.LLLF.invoke(condition);
            playbookConditionSelectDialog.close(1);
        }
    }

    public static final void accept$1(C16HT c16ht, Object obj) {
        int i;
        AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment = (AnchorTextHeaderGuideSheetFragment) c16ht.l0;
        anchorTextHeaderGuideSheetFragment.close(1);
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            if (anchorTextHeaderGuideSheetFragment.LLLI == 0) {
                i = 1;
            } else {
                i = 2;
            }
            interfaceC971790bObLIZIZ.LJII(i, anchorTextHeaderGuideSheetFragment.getContext(), EnumC971980bOu.ALL_LIST_TYPE, true);
        }
    }
}
