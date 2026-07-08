package com.bytedance.android.btm.api.model;

import X.C18ES;
import X.C21248018De;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class BufferBtm implements Parcelable, Serializable {
    public static boolean optimizeToString;
    public final String btm;
    public final String nodeId;
    public final String pageId;
    public final int step;
    public List<String> targetPagesBtm;
    public final String treeId;
    public int useTimes;
    public static final C18ES Companion = new C18ES();
    public static final Parcelable.Creator<BufferBtm> CREATOR = new Parcelable.Creator<BufferBtm>() { // from class: X.1505
        @Override // android.os.Parcelable.Creator
        public final BufferBtm createFromParcel(Parcel parcel) {
            return new BufferBtm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BufferBtm[] newArray(int i) {
            return new BufferBtm[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (!optimizeToString) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("btm", this.btm);
                jSONObject.put("step", this.step);
                jSONObject.put("pageId", this.pageId);
                jSONObject.put("nodeId", this.nodeId);
                jSONObject.put("treeId", this.treeId);
                jSONObject.put("useTimes", this.useTimes);
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = this.targetPagesBtm.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("targetPagesBtm", jSONArray);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return C786410Ut5.J3(jSONObject);
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append('{');
        C21248018De.LJ(sb, "btm", this.btm);
        C21248018De.LIZIZ(sb, "step", Integer.valueOf(this.step));
        C21248018De.LJ(sb, "pageId", this.pageId);
        C21248018De.LJ(sb, "nodeId", this.nodeId);
        C21248018De.LJ(sb, "treeId", this.treeId);
        C21248018De.LIZIZ(sb, "useTimes", Integer.valueOf(this.useTimes));
        if (!this.targetPagesBtm.isEmpty()) {
            C21248018De.LIZJ("targetPagesBtm", sb);
            sb.append('[');
            List<String> list = this.targetPagesBtm;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append('\"');
                sb.append((String) ListProtector.get(list, i));
                sb.append('\"');
            }
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }

    public final String getBtm() {
        return this.btm;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final int getStep() {
        return this.step;
    }

    public final List<String> getTargetPagesBtm() {
        return this.targetPagesBtm;
    }

    public final String getTreeId() {
        return this.treeId;
    }

    public final int getUseTimes() {
        return this.useTimes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BufferBtm(Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        int i = parcel.readInt();
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this(string, i, string2, string3, string4 != null ? string4 : "", parcel.readInt(), new ArrayList());
        parcel.readList(this.targetPagesBtm, String.class.getClassLoader());
    }

    public final void setTargetPagesBtm(List<String> list) {
        this.targetPagesBtm = list;
    }

    public final void setUseTimes(int i) {
        this.useTimes = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.btm);
        parcel.writeInt(this.step);
        parcel.writeString(this.pageId);
        parcel.writeString(this.nodeId);
        parcel.writeString(this.treeId);
        parcel.writeInt(this.useTimes);
        parcel.writeList(this.targetPagesBtm);
    }

    public BufferBtm(String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        this.btm = str;
        this.step = i;
        this.pageId = str2;
        this.nodeId = str3;
        this.treeId = str4;
        this.useTimes = i2;
        this.targetPagesBtm = list;
        this.useTimes = Math.max(i2, 1);
    }
}
