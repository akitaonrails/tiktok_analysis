package com.appsflyer.internal;

import X.C15438062q;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1eSDK {
    public static final JSONArray AFInAppEventType(List<AFd1fSDK> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AFd1fSDK> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().AFKeystoreWrapper());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean values(HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            return true;
        }
        return false;
    }
}
