package X;

import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KH1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KH1 {
    public TemplateListData LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public TemplateInfo LIZLLL;
    public PreCheckResult LJ;
    public Integer LJFF;
    public List<UpdateTips> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public C0KH1(TemplateListData templateListData, boolean z, int i, TemplateInfo templateInfo, PreCheckResult preCheckResult, List list, int i2) {
        templateListData = (i2 & 1) != 0 ? null : templateListData;
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? 0 : i;
        templateInfo = (i2 & 8) != 0 ? null : templateInfo;
        preCheckResult = (i2 & 16) != 0 ? null : preCheckResult;
        list = (i2 & 64) != 0 ? new ArrayList() : list;
        this.LIZ = templateListData;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = templateInfo;
        this.LJ = preCheckResult;
        this.LJFF = null;
        this.LJI = list;
    }
}
