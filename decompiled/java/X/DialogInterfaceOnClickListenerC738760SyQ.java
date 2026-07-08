package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelInteractionInputBottomBarAssem;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class DialogInterfaceOnClickListenerC738760SyQ implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC738760SyQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC738760SyQ dialogInterfaceOnClickListenerC738760SyQ, DialogInterface dialogInterface, int i) {
        String aid;
        Aweme aweme;
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        CommentContextSource commentContextSourceHp = ((TitlePanelInteractionInputBottomBarAssem) dialogInterfaceOnClickListenerC738760SyQ.l0).hp();
        if (commentContextSourceHp != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceHp)) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        mobClick.setValue(aid);
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC738760SyQ dialogInterfaceOnClickListenerC738760SyQ, DialogInterface dialogInterface, int i) {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        TitlePanelInteractionInputBottomBarAssem titlePanelInteractionInputBottomBarAssem = (TitlePanelInteractionInputBottomBarAssem) dialogInterfaceOnClickListenerC738760SyQ.l0;
        C723150SYf c723150SYf = titlePanelInteractionInputBottomBarAssem.LLJZIJLIL;
        String aid2 = null;
        if (c723150SYf != null) {
            Object[] objArr = new Object[2];
            CommentContextSource commentContextSourceHp = titlePanelInteractionInputBottomBarAssem.hp();
            if (commentContextSourceHp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceHp)) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            objArr[0] = aid;
            objArr[1] = 1;
            c723150SYf.LIZJ(objArr);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        CommentContextSource commentContextSourceHp2 = ((TitlePanelInteractionInputBottomBarAssem) dialogInterfaceOnClickListenerC738760SyQ.l0).hp();
        if (commentContextSourceHp2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceHp2)) != null) {
            aid2 = aweme.getAid();
        }
        mobClick.setValue(aid2);
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC738760SyQ dialogInterfaceOnClickListenerC738760SyQ, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738760SyQ.l0).getAid());
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC738760SyQ dialogInterfaceOnClickListenerC738760SyQ, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738760SyQ.l0).getAid());
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC738760SyQ dialogInterfaceOnClickListenerC738760SyQ, DialogInterface dialogInterface, int i) {
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("cancel");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738760SyQ.l0).getAid());
        C20684815ws.onEvent(mobClick);
    }
}
