package X;

import android.content.Context;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.assem.MentionListAssem;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16HA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HA implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C16HA(X.C20743716Ff r2, X.DialogC20518615Qq r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16HA.<init>(X.16Ff, X.15Qq, int):void");
    }

    public static final void onCheckedChanged$0(C16HA c16ha, CompoundButton compoundButton, boolean z) {
        int value;
        String str;
        String str2;
        Map<String, String> map;
        String str3;
        Map<String, String> map2;
        Map<String, String> map3;
        MentionContainerViewModel mentionContainerViewModelNo = ((MentionListAssem) c16ha.l0).No();
        mentionContainerViewModelNo.getClass();
        if (z) {
            value = EnumC1439580nZ6.ENABLE.getValue();
        } else {
            value = EnumC1439580nZ6.DISABLE.getValue();
        }
        C20612815lG c20612815lG = mentionContainerViewModelNo.LL;
        String creationId = null;
        if (c20612815lG == null) {
            c20612815lG = null;
        }
        InterfaceC20613315lL interfaceC20613315lL = c20612815lG.LJII;
        if (interfaceC20613315lL != null) {
            interfaceC20613315lL.r6(value);
        }
        ((MentionListAssem) c16ha.l0).Vo();
        C1403120mcI c1403120mcI = C1403120mcI.LIZ;
        C20612815lG c20612815lG2 = ((MentionListAssem) c16ha.l0).No().LL;
        if (c20612815lG2 == null) {
            c20612815lG2 = null;
        }
        InterfaceC20613315lL interfaceC20613315lL2 = c20612815lG2.LJII;
        if (interfaceC20613315lL2 != null) {
            creationId = interfaceC20613315lL2.getCreationId();
        }
        String str4 = "";
        if (creationId == null) {
            creationId = "";
        }
        C20612815lG c20612815lG3 = ((MentionListAssem) c16ha.l0).LLJ;
        if (c20612815lG3 == null || (map3 = c20612815lG3.LIZLLL) == null || (str = map3.get("enter_from")) == null) {
            str = "";
        }
        C20612815lG c20612815lG4 = ((MentionListAssem) c16ha.l0).LLJ;
        if (c20612815lG4 == null || (map2 = c20612815lG4.LIZLLL) == null || (str2 = map2.get("enter_type")) == null) {
            str2 = "";
        }
        C20612815lG c20612815lG5 = ((MentionListAssem) c16ha.l0).LLJ;
        if (c20612815lG5 != null && (map = c20612815lG5.LIZLLL) != null && (str3 = map.get("shoot_way")) != null) {
            str4 = str3;
        }
        boolean zIsPrivateAccount = ((IStoryMentionShareService) c16ha.l1).isPrivateAccount();
        c1403120mcI.getClass();
        C1403120mcI.LIZ(zIsPrivateAccount, str, str2, str4, creationId, "", z);
    }

    public static final void onCheckedChanged$1(C16HA c16ha, CompoundButton compoundButton, boolean z) {
        String string;
        InputMethodManager inputMethodManager;
        Editable text;
        C1749190vcT c1749190vcT = ((DialogC20518615Qq) c16ha.l0).LLJLILLLLZIIL;
        if (c1749190vcT != null) {
            C500260Jjc.LJLJLJ(c1749190vcT, C500260Jjc.LJJJI(Boolean.valueOf(((C20743716Ff) c16ha.l1).isChecked())));
        }
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(((C20743716Ff) c16ha.l1).isChecked()))) {
            DialogC20518615Qq dialogC20518615Qq = (DialogC20518615Qq) c16ha.l0;
            C1748440vbG c1748440vbG = dialogC20518615Qq.LLJLL;
            if (c1748440vbG == null || (text = c1748440vbG.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            dialogC20518615Qq.LLLIIII = string;
            C1748440vbG c1748440vbG2 = ((DialogC20518615Qq) c16ha.l0).LLJLL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.LLJLILLLLZIIL.setText("");
            }
            C1748440vbG c1748440vbG3 = ((DialogC20518615Qq) c16ha.l0).LLJLL;
            if (c1748440vbG3 != null) {
                Context context = c1748440vbG3.getContext();
                List<KeyBoardUtil.AndroidBug5497Workaround> list = KeyBoardUtil.LIZ;
                if (context != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
                    c1748440vbG3.LJIIIIZZ(inputMethodManager, 0);
                    return;
                }
                return;
            }
            return;
        }
        DialogC20518615Qq dialogC20518615Qq2 = (DialogC20518615Qq) c16ha.l0;
        C1748440vbG c1748440vbG4 = dialogC20518615Qq2.LLJLL;
        if (c1748440vbG4 == null) {
            return;
        }
        c1748440vbG4.LLJLILLLLZIIL.setText(dialogC20518615Qq2.LLLIIII);
    }

    public static final void onCheckedChanged$2(C16HA c16ha, CompoundButton compoundButton, boolean z) {
        ((C20743716Ff) c16ha.l0).setChecked(!((DialogC20518615Qq) c16ha.l1).LLLF);
        ((DialogC20518615Qq) c16ha.l1).LLLF = ((C20743716Ff) c16ha.l0).isChecked();
    }

    public static final void onCheckedChanged$3(C16HA c16ha, CompoundButton compoundButton, boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ((C20623515mz) c16ha.l0).LIZIZ = z;
        C786410Ut5.LLLLZLL((TuxTextView) c16ha.l1, i);
        Function1<? super Boolean, Unit> function1 = ((C20623515mz) c16ha.l0).LIZJ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        ChooseItemViewModel chooseItemViewModel = ((C20623515mz) c16ha.l0).LIZLLL;
        chooseItemViewModel.LLILZ = z;
        int i3 = chooseItemViewModel.LL;
        if (z) {
            i2 = chooseItemViewModel.LLILLJJLI;
        }
        chooseItemViewModel.vQ2(i3 + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onCheckedChanged$4(X.C16HA r6, android.widget.CompoundButton r7, boolean r8) {
        /*
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem r0 = (com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem) r0
            com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel r1 = r0.ip()
            if (r8 == 0) goto L47
            X.0nZ6 r0 = X.EnumC1439580nZ6.ENABLE
        Lc:
            r1.LLJILJILJ = r0
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem r0 = (com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem) r0
            r0.So()
            X.0mcI r1 = X.C1403120mcI.LIZ
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem r0 = (com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem) r0
            com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel r0 = r0.ip()
            java.lang.String r4 = r0.LLILLL
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem r0 = (com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishShareAssem) r0
            com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel r0 = r0.ip()
            java.lang.String r7 = r0.LLILLJJLI
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.story.service.IStoryMentionShareService r0 = (com.ss.android.ugc.aweme.story.service.IStoryMentionShareService) r0
            if (r0 == 0) goto L45
            boolean r0 = r0.isPrivateAccount()
            r2 = 1
            if (r0 != r2) goto L45
        L38:
            java.lang.String r3 = "immersive_story"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r1.getClass()
            X.C1403120mcI.LIZ(r2, r3, r4, r5, r6, r7, r8)
            return
        L45:
            r2 = 0
            goto L38
        L47:
            X.0nZ6 r0 = X.EnumC1439580nZ6.DISABLE
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16HA.onCheckedChanged$4(X.16HA, android.widget.CompoundButton, boolean):void");
    }

    public C16HA(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
