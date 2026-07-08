package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C630802d8 extends Message<C630802d8, C631002dA> {
    public static final ProtoAdapter<C630802d8> ADAPTER = new ProtoAdapter<C630802d8>() { // from class: X.02d9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C630802d8 decode(ProtoReader protoReader) {
            C630802d8 c630802d8 = new C630802d8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c630802d8.id = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c630802d8.formatted_name = C1DAG.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c630802d8.icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c630802d8.name_en = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c630802d8.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c630802d8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C630802d8 c630802d8) {
            C630802d8 c630802d82 = c630802d8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c630802d82.name) + protoAdapter.encodedSizeWithTag(2, c630802d82.name_en) + C029C.ADAPTER.encodedSizeWithTag(3, c630802d82.icon) + C1DAG.ADAPTER.encodedSizeWithTag(4, c630802d82.formatted_name) + protoAdapter.encodedSizeWithTag(5, c630802d82.id) + c630802d82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C630802d8 c630802d8) {
        }
    };
    public C1DAG formatted_name;
    public C029C icon;
    public String id;
    public String name;
    public String name_en;

    public C630802d8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C631002dA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
