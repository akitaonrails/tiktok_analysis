package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2346109Hf extends C09AY implements Function0<Gson> {
    public C2346109Hf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZJ(new MultiEditVideoSegmentRecordDataDeserializer(), MultiEditVideoSegmentRecordData.class);
        eVar.LIZJ(new MvNetFileBeanDeserializer(), MvNetFileBean.class);
        eVar.LIZJ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        return eVar.LIZ();
    }
}
