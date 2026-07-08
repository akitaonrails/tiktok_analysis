package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc;

import X.C16FS;
import X.C500260Jjc;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TitleEditDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms8Lix9HCw4JSoWLCw4DSYyJCor";
    public final String LLJZIJLIL;
    public final Function1<String, Unit> LLL;
    public EditText LLLF;
    public C16FS LLLFF;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hgo;
    }

    public TitleEditDialog(String str, AwS397S0200000_31 awS397S0200000_31) {
        this.LLJZIJLIL = str;
        this.LLL = awS397S0200000_31;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLF = (EditText) view.findViewById(R.id.y1f);
        this.LLLFF = (C16FS) view.findViewById(R.id.y1e);
        EditText editText = this.LLLF;
        if (editText != null) {
            editText.setText(this.LLJZIJLIL);
        }
        C16FS c16fs = this.LLLFF;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS610S0100000_31(this, 42));
        }
    }
}
